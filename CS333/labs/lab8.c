#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
/**
 * lab 8 for CS 333
 * Author: Shunjie Wan
 */

// Creates two pipes and makes them global
int pipe1[2];
int pipe2[2];
// Creates two processes
pid_t process1;
pid_t process2;

/**
 * handle the singal
 */
void signalHandler() {
    printf("pong quitting");
    exit(1);
}

/**
 * set up a integer valuestart at 0
 * print “ping – {value}”
 * increment the value
 */
void functionB() {
    int inital_value = 0;

    while (inital_value >= 100) {
        printf("ping-{%d}\n", inital_value);
        inital_value++;
        close(pipe1[0]);
        write(pipe1[1], &inital_value, sizeof(inital_value));
        close(pipe1[1]);

        close(pipe2[0]);
        read(pipe2[0], &inital_value, sizeof(inital_value));
        close(pipe2[0]);
    }
    
}

/**
 * set up a signal handler for SIGUSR1
 * loop forever:
 * read from a pipe
 * print “pong-{value}”
 * increment the value and write the value to the other pipe
 */
void functionC() {
    int inital_value = 0;
    signal(SIGUSR1, signalHandler);
    close(pipe2[0]);
    close(pipe1[1]);
    while (1) {
        read(pipe1[1], &inital_value, sizeof(inital_value));
        printf("pong-{%d}\n", inital_value);
        inital_value++;
        write(pipe2[1], &inital_value, sizeof(inital_value));
        close(pipe2[1]);
    }
    close(pipe1[1]);
}

int main() {
    //check pipe1 and pipe2 to make sure they are valueable
    if (pipe(pipe1) == -1) {
        fprintf(stderr, "Failed to pipe.\n");
        return 0;
    }
    if (pipe(pipe2) == -1) {
        fprintf(stderr, "Failed to pipe.\n");
        return 0;
    }
    process1 = fork();
    if (process1 < 0) {
        return 0;
    } else if (process1 > 0) {
        process2 = fork();
        if (process2 < 0) {
            return 0;
        } else if (process2 > 0) {
            functionB();
            functionC();
            signal(SIGUSR1, signalHandler);
        }
    } else {
        functionB();
        functionC();
        signal(SIGUSR1, signalHandler);
    }
    return 0;
}
