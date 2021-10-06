#include <string.h>
#include <sys/socket.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <netinet/in.h>
#include <stdio.h>
#include <stdlib.h>

#define PORT 8080
#define MAX 100

/**
 * lab 9 for CS 333
 * Author: Shunjie Wan
 */

// error checked function
void error(const char *error_type) {
    perror(error_type);
    exit(1);
}

/**
 * client mode
 */
void func_client(const char *host, float port) {
    int sock_fd;
    struct sockaddr_in sockaddr;
    sockaddr.sin_family = AF_INET;
    sockaddr.sin_port = htons((uint16_t)port);
    struct hostent *host1 = gethostbyname(host);
    memcpy(&sockaddr.sin_addr, host1->h_addr, host1->h_length);
    // Create socket
    sock_fd = socket(AF_INET, SOCK_STREAM, 0);
    int connect_fd =
        connect(sock_fd, (struct sockaddr *)&sockaddr, sizeof(struct sockaddr));
    if (connect_fd < 0) {
        error("connect");
        exit(EXIT_FAILURE);
    }
    while (1) {
        char buffer[MAX];
        const char *message = "ping";
        send(sock_fd, message, 4, 0);
        
        if (recv(sock_fd, buffer, 4, 0) <= 0) {
            printf("Disconnect successfully...\n");
            break;
        }
        printf("%s\n", buffer);
    }
}

/**
 * server mode
 * accepts an address and a port from the command line
 * create a TCP socket and print the address if there is no command
 */
void func_server() {
    int sock_fd;
    socklen_t addr_len;
    struct sockaddr_in server_addr;
    if ((sock_fd = socket(AF_INET, SOCK_STREAM, 0)) < 0) {
        printf("socket error\n");
        exit(1);
    }

	//set up the socket
    server_addr.sin_family = AF_INET;
    server_addr.sin_addr.s_addr = INADDR_ANY;
    server_addr.sin_port = htons(PORT);

	//check whether if binding successfully
    if (bind(sock_fd, (struct sockaddr *)&server_addr, sizeof(server_addr)) <
        0) {
        error("bind failed");
        exit(1);
    }
    char name[MAX];
    struct hostent *hostent;
    gethostname(name, sizeof(name));
    //server mode menu
    hostent = gethostbyname(name);
    printf("Server mode...\n");
    printf("IP Address: ");
    for (int i = 0; hostent->h_addr_list[i]; i++) {
        printf("%s ", inet_ntoa(*(struct in_addr *)(hostent->h_addr_list[i])));
    }
    printf("\nPort: %d\n", PORT);
    if (listen(sock_fd, 5) < 0) {
        exit(1);
    }


    int connect;
    struct sockaddr_in conn_addr;
    addr_len = sizeof(conn_addr);
    connect = accept(sock_fd, (struct sockaddr *)&conn_addr, &addr_len);
    //passing message to client
    while (1) {
        char buffer[MAX];
        const char *message = "pong";
        if (recv(connect, buffer, 4, 0) <= 0) {
            printf("Disconnect successfully...\n");
            break;
        }
        printf("%s\n", buffer);
        send(connect, message, 4, 0);
    }
}

int main(int argc, char const* argv[]) {	
    if (argc < 3) {
		//no address and port on the command line, call server mode
        func_server();
    } else {
		//pass ip address and port to the client mode 
        func_client(argv[1], atoi(argv[2]));
        return 0;
    }
}
