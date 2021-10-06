#include <netdb.h>
#include <netinet/in.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <sys/types.h>
#include <unistd.h>
#define PORT 8080
#define SA struct sockaddr
#define MAX 100
/**
 * lab 9 for CS 333
 * Author: Shunjie Wan
 */
int port = 8080;
char* server_Addr;

void func_server(int sockfd) {
    char buff[MAX];
    int n;
    for (;;) {
        bzero(buff, MAX);
        read(sockfd, buff, sizeof(buff));
        n = 0;
        while ((buff[n++] = getchar()) != '\n')
            ;
        write(sockfd, buff, sizeof(buff));

        if (strncmp("exit", buff, 4) == 0) {
            printf("Exiting from server\n");
            break;
        }
    }
}

void func_client(int socket_fd) {
    char buff[MAX];
    int n;
    for (;;) {
        bzero(buff, sizeof(buff));
        printf("ping");
        n = 0;
        while ((buff[n++] = getchar()) != '\n')
            ;
        write(socket_fd, buff, sizeof(buff));
        bzero(buff, sizeof(buff));
        read(socket_fd, buff, sizeof(buff));
        printf("pong:%s", buff);
        if ((strncmp(buff, "exit", 4)) == 0) {
            printf("Exiting client...\n");
            break;
        }
    }
}

int server() {
    int sock_fd, conn_fd, len;
    struct sockaddr_in serveraddr, cli;
    sock_fd = socket(AF_INET, SOCK_STREAM, 0);
    if (sock_fd == -1) {
        printf("Creating socket failed...");
        exit(1);
    } else {
        printf("socket created successfully...");
        bzero(&serveraddr, sizeof(serveraddr));
        serveraddr.sin_family = AF_INET;
        serveraddr.sin_addr.s_addr = htonl(INADDR_ANY);
        serveraddr.sin_port = htonl(PORT);
    }
    if ((bind(sock_fd, (SA*)&serveraddr, sizeof(serveraddr)))) {
        printf("Bind failed.");
        exit(1);
    } else {
        printf("Server listening..\n");
        len = sizeof(cli);
        conn_fd = accept(sock_fd, (SA*)&cli, &len);
    }
    if (conn_fd < 0) {
        printf("Server accept failed...\n");
        exit(1);
    } else {
        printf("Accepted client\n");
        server(conn_fd);
        close(sock_fd);
    }
}

int client() {
    int sock_fd;
    int conn_fd;
    struct sockaddr_in serveraddr, cli;
    sock_fd = sockfd(AF_INET, SOCK_STREAM, 0);
    if (sock_fd == -1) {
        printf("Socket created failed\n");
        exit(1);
    } else {
        printf("Socket created successfully.");
        bzero(&serveraddr, sizeof(serveraddr));
        serveraddr.sin_family = AF_INET;
        serveraddr.sin_addr.s_addr = inet_addr("127.0.0.1");
        serveraddr.sin_port = htonl(PORT);
        if (connect(sock_fd, (SA*)&serveraddr, sizeof(serveraddr))) {
            printf("Connected failed.\n");
            exit(1);
        } else {
            printf("Connecting to the server...\n");
            func_client(sock_fd);
            close(sock_fd);
        }
    }
}

int main(int argc, char const* argv[]) {
    if (argc <= 1) {
        printf("Server mode\n");
        int ser = server();
    } else {
        printf("client mode\n");
        server_Addr = argv[0];
        char* port_number = argv[1];
        int k = 1;
        for (int i = 0; i < strlen(port_number); i++) {
            k *= 10;
            k += (port_number[i] - '0');
        }
        port = k;
        int cl = client();
    }
    return 0;
}
