#include <arpa/inet.h>
#include <errno.h>
#include <fcntl.h>
//#include <netdb.h>
//#include <netinet/in.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <unistd.h>
#define MAX_SIZE 1024
#define FILE_NAME_SIZE 100
/**
 * assignment 3 Remote Backup System 1 for CS 333
 * Author: Shunjie Wan --client mode
 * Partner: Jiangwei Shi -- server mode
 */

char file_name[FILE_NAME_SIZE];
int client_socket;
char buffer[MAX_SIZE];

void file_generator() {
    char filename[10];
    FILE *fp;
    fp = fopen("sent", "w");
    fputs("file for cs 333 assignment 3", fp);
    if (fp == NULL) {
        printf("File:\t%s can not open.\n", file_name);
        exit(1);
    }
    fclose(fp);
}

/**
 * create socket for client to connect with server 
 */
void connect_server(const char *ip, short port) {
    int client_socket;
    struct sockaddr_in serverAddr;
    //throw error when can not create socket
    if ((client_socket = socket(AF_INET, SOCK_STREAM, 0)) < 0) {
        perror("socket");
        exit(1);
    }

    serverAddr.sin_family = AF_INET;
    serverAddr.sin_addr.s_addr = inet_addr(ip);
    serverAddr.sin_port = htons(port);
    //throw error when can not connect with server
    if (connect(client_socket, (struct sockaddr *)&serverAddr,
                sizeof(serverAddr)) < 0) {
        perror("connect");
        exit(1);
    } else {
        printf("Successfully connect to the server...\n");
    }
}

/**
 * stat() the file, get number of bytes 
 * send the file to server
 */
void push() {
    bzero(file_name, sizeof(file_name));
    printf("----------------------------------\n");
    printf("Here will create a test file send to the server.\n");
    printf("Please enter file name:\n");
    scanf("%s", file_name);
    FILE *fp;
    fp = fopen(file_name, "w");
    //write a sentence to the file as test
    fputs("This is a test file created for cs 333 assignment 3 as PUSH.", fp);
    if (fp == NULL) {
        printf("File:\t%s can not open.\n", file_name);
        exit(1);
    }
    fclose(fp);

    //stat() function to get the number of bytes
    struct stat file_size;
    stat(file_name, &file_size);
    printf("The file size is: %lld bytes.\n", file_size.st_size);
    char buffer[MAX_SIZE];
    bzero(buffer, sizeof(buffer));
    strncpy(buffer, file_name,
            strlen(file_name) > MAX_SIZE ? MAX_SIZE : strlen(file_name));
    
    send(client_socket, buffer, MAX_SIZE, 0);
    printf("File has successfully sent to server.\n");
}

/**
 * receive file from server 
 * store the file in disk
 */
void pull() {
    int length = 0;
    char file_name[100]="Received_from_server";
    memset(buffer, 0, sizeof(buffer));
    int file_fp = open(file_name, O_CREAT | O_RDWR, 0777);
    if (file_fp < 0) {
        printf("File: %s can not open\n", file_name);
    }
    while ((length = recv(client_socket, buffer, MAX_SIZE, 0)) > 0) {
        write(file_fp, buffer, length);
        if (write(file_fp, buffer, length) < length) {
            printf("File:\t%s Write Failed\n", file_name);
            break;
        }
        if (length < sizeof(buffer)) {
            break;
        }
        memset(buffer, 0, sizeof(buffer));
        
    }
    printf("Successful receive file: %s.\n", file_name);
    close(file_fp);
}

/**
 * quit from the server
 * free all open resources
 */
void quit() {
    printf("Quit from the server...\n");
    close(client_socket);
    exit(1);
}
int main(int argc, char const *argv[]) {
    char ip[20];//store server ip
    short port; // store server port
    char command[10];
    //let user enter server's ip and port
    printf("Please enter server's ip address: \n");
    scanf("%s", ip);
    printf("Please enter server's port: \n");
    scanf("%hd", &port);
    connect_server(ip, port);
    
    //accept command from user 
    while (1) {
        printf("-------------------------------------------\n");
        printf("Please enter a command: PUSH | PULL | QUIT.\n");
        scanf("%s", command);
        if (strcmp(command, "PUSH") == 0) {
            push();
        } else if (strcmp(command, "PULL") == 0) {
            pull();
        } else if (strcmp(command, "QUIT") == 0) {
            quit();
        } else {
            printf("Please enter a correct command.\n");
            scanf("%s", command);
        }
    }
    return 0;
}
