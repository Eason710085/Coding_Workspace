#include <stdio.h>
#include <stdlib.h>
/**
 * CS 333 lab 4
 * Name: Shunjie Wan
 */
int main() {
    char c;
    FILE *fp;
    fp = fopen("检讨.txt", "w+");    
    /* write to file */
    for (int i = 0; i < 10000; i++)
    {
      fprintf(fp, "我错了，再也不看美女了.");
    }
    fclose(fp);
    
    fp=fopen("file.txt","r");
    while((c=fgetc(fp))!=EOF) {
      printf("%c",c);
    }
    fclose(fp);
    return 0;
}