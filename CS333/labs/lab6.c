#include <stdio.h>
#include <stdlib.h>

/**
 * CS 333 lab 6
 * Name: Shunjie Wan
 */
int Zero = 0;
int One  = 0;
int count(int num) {
    for (int i = 0; i < sizeof(int) * 8; i++) {
        if (num & 1) {
            One++;
        } else {
            Zero++;
        }
        num >>= 1;
    }
    return num;
}
int main(int argc, char const *argv[]) {
    if (argc != 2) {
        printf("You have to enter a number in the command line.\n");
    } else {
        //take the first number from command line
        int num = atoi(argv[1]);
        count(num);
        printf("In %d, there are %d bits set to 0", num, Zero);
        printf("\nIn %d, there are %d bits set to 1\n", num, One);
    }

    return 0;
}
