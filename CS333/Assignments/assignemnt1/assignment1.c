#include <stdio.h>
#include <stdlib.h>
/*
Code for CS 333 assignment 1
Name: Shunjie Wan
*/

//Set Match =1 is True, so Match = 0 is False.
int Match = 1;
int flag  = 1;
int num1;
int num2;
int globalScore = 0;

/**
 * assign each card a text string, randomly.
 */
void assignString(){

}


/**
 * print “Setting up the game”.
 */
void initialization() {
    printf("Setting up the game\n");
}


/**
 * accept two numbers, from 1 to 20
 */
void acceptInput() {
    printf("Please enter two different numbers between 1-20.\n");
    printf("Enter 0 1 if you want to quit the game.\n");
    scanf("%d %d", &num1, &num2);
    if (num1 * num2 == 0) {
        flag = 0;
    } else if (num1 == num2) {
        printf("Please enter two different number(re-enter)\n");
        scanf("%d %d", &num1, &num2);
    } else if (num1 > 20 || num2 > 20 || num1 < 1 || num2 < 1) {
        printf("Please enter number between 1-20.\n");
        scanf("%d %d", &num1, &num2);
    }
}

/**
 * if n1*2=n2 || n2*2=n1, score++,
 */
void updateTheStateOfWorld(int n1, int n2) {
    if (n1 * 2 == n2) {
        globalScore++;
    } else if (n2 * 2 == n1) {
        globalScore++;
    } else {
        Match = 0;
    }
}

/**
 * Print the result calculated in the state of the world 
 */
void displayTheStateOfWorld(int judge) {
    if (judge == 1) {
        printf("match.\n");
        printf("Your score is: %d\n", globalScore);
    } else if (judge == 0) {
        printf("no\n");
        //reset Match to True
        Match = 1;
    }
}

/**
 *print “Destroying the game” 
 */
void tearDown() {
    printf("destorying the game\n");
    exit(0);
}

/**
 * Call initialization, then loop until a flag is set,
 * calling accept input, update and display. 
 * Outside of the loop, call teardown
 */
int main() {
    initialization();
    while (flag != 0) {
        acceptInput();
        updateTheStateOfWorld(num1, num2);
        displayTheStateOfWorld(Match);
    }
    printf("Your final score is: %d\n", globalScore);
    tearDown();
    return 0;
}
