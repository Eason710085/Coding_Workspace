#include <stdio.h>
/*
Code for CS 333 lab 2, Name: Shunjie Wan
Create a program that allocates two variables.
Create two pointers that point to those two variables. Set the first variable to a value. 
Dereference the second pointer to set it to a value. Print all four values.
*/

int main(){
    //create two variables
    int var1;
    int var2;
    //create two pointers
    int *p1;
    int *p2;
    //Create two pointers that point to those two variables
    p1 = &var1, p2 =&var2;
    //set var1= 3, pointer2 = 5;
    var1 = 3;
    *p2 =5;

    printf("The first variable is %d\n" ,var1);
    printf("The second variable is %d\n" ,var2);
    printf("Pointer 1 is %d\n" ,*p1);
    printf("Point 2 is %d\n" ,*p2);

    return 0;
}
