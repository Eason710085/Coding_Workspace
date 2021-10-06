#include <fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/mman.h>
#include <sys/stat.h>
#include <unistd.h>

/**
 * lab 11 for cs 333
 * author: Shunjie Wan
 */
char share_data[102000];

void task3() {
    struct stat st;
    int fd = shm_open("./data", O_RDWR | O_CREAT, 0777);
    if (fd == -1) {
        perror("open");
    }

    if (fstat(fd, &st) < 0) {
        perror("stat");
        close(fd);
        exit(1);
    }

    ftruncate(fd, sizeof(fd));
    char *p_map =
        mmap(0, st.st_size, PROT_READ | PROT_WRITE, MAP_SHARED, fd, 0);

    printf("----------------task3---------------");
    printf("%s", share_data);
    memcpy(fd, share_data, sizeof(fd));
    printf("The data bas been copied to the share memory.\n");
    munmap(share_data, fd);
    close(fd);
}

void task4() {
    int f = open("new_file", O_RDWR | O_CREAT, 0777);
    if (f == -1) {
        /* code */
        perror("create");
    }

    memcpy(share_data, f, sizeof(share_data));
    printf("----------------task4---------------\n");
    printf("The data has been copy to the new file from share data.\n");
}

int main(int argc, char const *argv[]) {
    task3();
    task4();
    return 0;
}
