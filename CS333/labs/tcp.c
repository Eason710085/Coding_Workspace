#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <stdlib.h>

#define PORT 8765

void server() {
	int sock;
	socklen_t addr_length;
	struct sockaddr_in server_addr;
	if ((sock = socket(AF_INET, SOCK_STREAM, 0)) < 0) {
		printf("socket error\n");
		exit(1);
	}

	memset(&server_addr, 0, sizeof(server_addr));
	server_addr.sin_family = AF_INET;
	server_addr.sin_addr.s_addr = INADDR_ANY;
	server_addr.sin_port = htons(PORT);

	if (bind(sock, (struct sockaddr*) &server_addr, sizeof(server_addr)) < 0) {
		perror("bind");
		exit(1);
	}

	char hname[128];
	struct hostent *hent;
	int i;

	gethostname(hname, sizeof(hname));

	hent = gethostbyname(hname);
	printf("Run as server\n");
	printf("IP Address: \n");
	for (i = 0; hent->h_addr_list[i]; i++) {
		printf("%s ", inet_ntoa(*(struct in_addr*) (hent->h_addr_list[i])));
	}
	printf("\nPort: %d\n", PORT);
	if (listen(sock, 5) < 0) {
		exit(1);
	}
	int conn;
	struct sockaddr_in conn_addr;
	addr_length = sizeof(conn_addr);
	conn = accept(sock, (struct sockaddr*) &conn_addr, &addr_length);
	while (1) {
		char buf[20];
		const char *msg = "pong";
		memset(buf, 0, sizeof(buf));
		if (recv(conn, buf, 4, 0) <= 0) {
			printf("disconnect\n");
			break;
		}
		printf("%s\n", buf);
		send(conn, msg, 4, 0);
	}
	
}

void client(char *host, short port) {
	int sock;
	struct sockaddr_in addr;
	addr.sin_family = AF_INET;
	addr.sin_port = htons((uint16_t) port);
	struct hostent *host1 = gethostbyname(host);
	memcpy(&addr.sin_addr, host1->h_addr, host1->h_length);
	sock = socket(AF_INET, SOCK_STREAM, 0);
	int ret = connect(sock, (struct sockaddr*) &addr, sizeof(struct sockaddr));
	if (ret < 0) {
		perror("connect");
		exit(EXIT_FAILURE);
	}
	printf("Run as client\n");
	while (1) {
		char buf[20];
		const char *msg = "ping";
		send(sock, msg, 4, 0);
		memset(buf, 0, sizeof(buf));
		if (recv(sock, buf, 4, 0) <= 0) {
			printf("disconnect\n");
			break;
		}
		printf("%s\n", buf);
	}
}

int main(int argc, char **argv) {
	if (argc < 3) {
		server();
	} else {
		client(argv[1], atoi(argv[2]));
	}

	return 0;
}
