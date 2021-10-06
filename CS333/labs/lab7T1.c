#include <fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <unistd.h>
/**
 * lab 7 Task 1 for CS 333
 * Author: Shunjie Wan
 */
extern char fileName[100];

int main(int argc, char const* argv[]) {
    char array[100];
    char string[100];
    int sum = 0;
    char fileName[100] = "numbers.";
    //random the number
    srand(time(0));
    for (int i = 0; i < 100; i++) {
        array[i] = rand() % 100;
        sum += array[i];
    }
    // convert interger sum to string type sum
    sprintf(string, "%d", sum);
    // Output: print the sum of the array
    printf("The sum of the array: %d \n", sum);
    // combine the "numbers." with the digital numbers and set file type: txt
    strcat(fileName, string);
    strcat(fileName, ".txt");

    int file = open(fileName, O_RDWR | O_CREAT, S_IRWXU);

    char buffer[100];
    char tab[10] = "    ";
    //write the array to the file
    for (int i = 0; i < 100; i++) {
        sprintf(buffer, "%d", array[i]);
        write(file, buffer, strlen(buffer));
        write(file, tab, strlen(tab));
    }
    close(file);
    return 0;
}
