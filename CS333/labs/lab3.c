#include <stdio.h>
#include <string.h>
/*
code for CS 333 lab 3
Name: Shunjie Wan
*/

int main()
{
    char string[100];
    int count;
    printf("please enter a string(without space):\n");
    scanf("%s", string);

    //indicate the termination of a character string, and count all the not null characters
    for (int i = 0; string[i] != '\0'; i++)
    {
        count++;
    }
    printf("The length of the string which I calculated is: %d\n", count);

    //use the standard function to find the length of the string;
    printf("The length of the string produce by the standard function is: %lu\n", strlen(string));
    return 0;
}
