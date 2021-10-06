#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/**
 * CS 333 concentation 2
 * author: Shunjie Wan
 */
int num, num1, num2;
int scores = 0;
int cardNum = 20;
int match = 1;
int flag = 1;
char array[20];

/**
 * make a struct of the concentation
 * including 20 cards and 10 different string
 */
struct CARDS {
    int cardNum;
    char text[10];
    int checkChosen;
};

// randomly assign string text to the cards
struct CARDS cards[20] = {
    {1, "cat"},     {2, "spider"},    {3, "horse"},     {4, "cat"},
    {5, "dog"},     {6, "tiger"},     {7, "chicken"},   {8, "dog"},
    {9, "tiger"},   {10, "chicken"},  {11, "spider"},   {12, "rabbit"},
    {13, "panda"},  {14, "monkey"},   {15, "rabbit"},   {16, "panda"},
    {17, "monkey"}, {18, "elephant"}, {19, "elephant"}, {20, "horse"}};

/**
 * initialization
 * “Setting up the game”.
 */
void initialization() {
    // allocate memory for the struct
    struct CARDS *cards;
    cards = (struct CARDS *)malloc(sizeof(struct CARDS));
    printf("Setting up the game...\n");
}

/**
 *print final scores
 *print “Destroying the game” and exit
 */
void tearDown() {
    // free all memory which allocate by molloc
    //free1(cards);
    printf("Your final score is: %d\n", scores);
    printf("Destorying the game...\n");
    exit(0);
}
/**
 * accept input from user
 * check the entered card numbers to make sure that they are valid
 */
void acceptinput() {
    if (num == 1) {
        printf("Please enter two different number(1-20)\n");
        scanf("%d %d", &num1, &num2);
        // check these two cards whether had matched
        if (array[num1] == num1 && array[num2] == num2) {
            printf("You have matched this two cards\n");
            printf("Please enter other cards: \n");
            acceptinput();
        }
        // check these two numbers to make sure they are validable
        if (num1 == num2) {
            printf("Please enter two different numbers, re-enter:\n");
            scanf("%d %d", &num1, &num2);
        } else if (num1 == 0 || num2 == 0) {
            printf("You could only enter number between 1-20\n");
            scanf("%d %d", &num1, &num2);
        } else if (num1 > 20 || num2 > 20 || num1 < 1 || num2 < 1) {
            printf("Please enter number between 1-20.\n");
            scanf("%d %d", &num1, &num2);
        }
    } else if (num == 0) {
        // if num =0, call teardown() function to flag the game
        tearDown();
    }
}


/**
 * update the scores
 * pass the struct of cards
 * detect when the game is over
 */
void updateWorld(struct CARDS cards[], int n1, int n2) {
    if (strcmp(cards[n1 - 1].text, cards[n2 - 1].text) == 0) {
        printf("------------------------------------\n");
        printf("A valid match was made successfully!\n");
        scores++;
        printf("Your current score is %d\n", scores);
        match = 1;
        array[num1] = num1;
        array[num2] = num2;
    } else {
        match = 0;
    }
}

/**
 * update the number of cards
 * show the available remaining card numbers
 */
void displayWorld(int match, struct CARDS cards[], int n1, int n2) {
    // char play;
    if (match == 1) {
        // Remove two numbers of cards if match
        cardNum--;
        cardNum--;
        printf("You still have %d cards\n", cardNum);
        if (cardNum == 0) {
            printf("You win the game...\n");
            printf("Do you want to play again? (|'1' to play|'0' to quit|)\n");
            scanf("%d", &flag);
            if (flag == 1) {
                printf("New game starts...\n");
                cardNum = 20;
                scores = 0;
                for (int i = 0; i < 20; i++) {
                    array[i] = '\0';
                }
            } else if (flag == 0) {
                tearDown();
            }
        }
    } else {
        printf("Match fail, try again.\n");
        printf("Card %d is %s.\n", num1, cards[num1].text);
        printf("Card %d is %s.\n", num2, cards[num2].text);
    }
}

/**
 * Call initialization, then loop until a flag is set,
 * calling accept input, update and display.
 * Outside of the loop, call teardown
 */
int main(int argc, char const *argv[]) {
    initialization();
    while (flag != 0) {
        printf("-----------------------------------------------\n");
        printf("Please enter '1' to continue, enter '0' to quit\n");
        scanf("%d", &num);
        if (num == 1) {
            acceptinput();
            updateWorld(cards, num1, num2);
            displayWorld(match, cards, num1, num2);
        } else if (num == 0) {
            tearDown();
        } else {
            printf("Please enter 1 or 0.\n");
        }
    }

    tearDown();
    return 0;
}
