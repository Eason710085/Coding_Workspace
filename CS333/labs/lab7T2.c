#include <dirent.h>
#include <fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

/**
 * lab 7 Task 2 for CS 333
 * Author: Shunjie Wan
 */
#define size 1024
char fileName[100] = "numbers.";
char buffer[100];
int ret = 0;
int num;
char string[100];

int main(int argc, char const *argv[]) {
    // struct dirent{
    //     unsigned char dataType;
    //     char dataName[100];
    // };
    struct dirent *entry;
    char currentDir[size];
    //get current directory 
    getcwd(currentDir, size);
    printf("Current directory is: %s\n", currentDir);
    printf("-------------------------------\n");
    printf("Enter the four numbers 'xxxx' after 'numbers.' of the file: \n");
    printf("Example: For file 'numbers.1234.txt', you enter 1234\n");
    scanf("%d", &num);
    sprintf(string, "%d", num);
    strcat(fileName, string);

    strcat(fileName, ".txt");
    printf("-------------------------------\n");
    printf("The file name is: %s\n", fileName);
    int file = open(fileName, O_RDWR, S_IRWXU);

    char buffer[500] = "{}";
    printf("The sum of the integer is %d\n", num);
    for (int i = 0; i < 500; i++) {
        read(file, buffer, strlen(buffer));
        printf("%s", buffer);
    }

    close(file);
    return 0;
}
