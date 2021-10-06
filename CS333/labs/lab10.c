#include <pthread.h>
#include <semaphore.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>
#define size 1000000
/**
 * lab 10
 * Author: Shunjie Wan 
 */

//set global sum by thread
int sum_by_thread = 0;
int array[1000000];
sem_t sem;
sem_t sem1;
/**
 * thread 1 for task 2
 */
void *thread1_for_task2(void *args) {
    printf("Thread 1 starting...\n"); 
    for (int i = 0; i < size / 2; i++) 
    {
        sum_by_thread += array[i];
    }
    printf("Sum by first thread: %d\n", sum_by_thread);
    return 0;
}
/**
 * thread 2 for task 2
 */
void *thread2_for_task2(void *args) {
    printf("Thread 2 starting...\n");
    for (int i = size / 2; i < size; i++) 
    {
        sum_by_thread += array[i];
    }
    printf("Sum by second thread: %d\n", sum_by_thread);
    return 0;
}

/**
 * thread 1 for task 3
 */
void *thread1_for_task3(void *args) {
    sem_wait(&sem);
    printf("Thread 1 starting...\n");
    sum_by_thread = 0;
    for (int i = 0; i < size / 2; i++) 
    {
        sum_by_thread += array[i];
    }
    printf("Sum by first thread: %d\n", sum_by_thread);
    sem_post(&sem);
    return 0;
}
/**
 * thread 2 for task 3
 */
void *thread2_for_task3(void *args) {
    sem_wait(&sem);
    printf("Thread 2 starting...\n");
    sum_by_thread = 0;
    for (int i = size / 2; i < size; i++) 
    {
        sum_by_thread += array[i];
    }
    printf("Sum by second thread: %d\n", sum_by_thread);
    sem_post(&sem);
    return 0;
}

/**
 * thread 1 for task 4
 */
void *thread1_for_task4(void *args) {
    printf("Thread 1 starting...\n");   
    sem_wait(&sem1);
    int local_sum;
    for (int i = 0; i < size / 2; i++) 
    {
        local_sum += array[i];
    }
    sum_by_thread += local_sum;
    printf("SUm by first thread: %d\n", local_sum);
    sem_post(&sem1);
    return 0;
}

/**
 * thread 2 for task 4
 */
void *thread2_for_task4(void *args) {
    printf("Thread 2 starting...\n");
    sem_wait(&sem1);
    int local_sum;
    for (int i = size / 2; i < size; i++) 
    {
        local_sum += array[i];
    }
    sum_by_thread += local_sum;
    printf("Sum by second thread: %d\n", local_sum);
    sem_post(&sem1);
    return 0;
}

int main(int argc, char const *argv[]) {
    //creat random number 
    srand((unsigned int)time(NULL));
    int sum = 0;
    for (int i = 0; i < size; i++) 
    {
        array[i] = rand() % 10;
        sum += array[i];  // sum the array
    }
    printf("---------------------Task 1------------------\n");
    printf("Study lecture slides.\n");
    printf("---------------------Task 2------------------\n"); 
    pthread_t thread1, thread2;
    pthread_create(&thread1, NULL, thread1_for_task2, NULL);
    pthread_create(&thread2, NULL, thread2_for_task2, NULL);
    sleep(1);
    printf("Correct value of sum = %d\n", sum);

    printf("---------------------Task 3------------------\n");
    pthread_t threadtask3_1, threadtask3_2;
    pthread_create(&threadtask3_1, NULL, thread1_for_task3, NULL);
    pthread_create(&threadtask3_2, NULL, thread2_for_task3, NULL);
    sleep(1);
    sem_destroy(&sem);
    printf("Correct value of sum = %d\n", sum);

    printf("---------------------Task 4------------------\n");
    sum_by_thread = 0;
    sem_init(&sem1, 0, 1);
    pthread_t threadtask4_1, threadtask4_2;
    pthread_create(&threadtask4_1, NULL, thread1_for_task4, NULL);
    pthread_create(&threadtask4_2, NULL, thread2_for_task4, NULL);
    sleep(1);
    sem_destroy(&sem1);
    printf("Summing by local variable in threads = %d\n",sum_by_thread);
    return 0;
}
