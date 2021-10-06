#include <stdio.h>
#include <stdlib.h>
#include <time.h>   
/**
 * lab 5 
 * Name: Shunjie Wan
 */

struct Node {
    int num;           
    struct Node* next;
};

/**
 * create a linked list
 */
struct Node* createList(){
    struct Node* headNode = (struct Node*)malloc(sizeof(struct Node));
    //head->num=NULL;
    headNode->next=NULL;
    return headNode;
}
/**
 * create node
 */
struct Node* createNode(int num){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode ->num = num;
    newNode ->next = NULL;
    return newNode;
}

/**
 * add number to the linked list
 */
void insertNum(struct Node* headNode, int num){
    struct Node* newNode =createNode(num);
    newNode ->next = headNode->next;
    headNode ->next = newNode;
}

/**
 * print all numbers in the list
 */
void printLists(struct Node* headNode){
    struct Node* pMove = headNode->next;
    while (pMove != NULL){
        printf("%d", pMove->num);
        pMove = pMove->next;
        //make space between numbers
        printf("  ");
    }
}

/**
 * create a listed list named list
 * add random number to the linked list
 * print the list and free all nodes if the number is 49
 */
int main(){
    srand(time(0));
    struct Node* list = createList();
    while (1){
        int randNum=rand()%51;
        if (randNum==49){
            printLists(list);
            free(list);
            break;
        }else{
            insertNum(list,randNum);  
        }
    }
    return 0;
}
