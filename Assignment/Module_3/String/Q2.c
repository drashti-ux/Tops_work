// Write a program in C to separate individual characters from a string.

#include <stdio.h>
#include <string.h>
int main(){
    char string[50];
    printf("Enter String : ");
    fgets(string,sizeof(string),stdin);
    int len = strlen(string);
    for(int i = 0;i<len-1;i++){
        printf("char %d: %c \n",i+1,string[i]);
    }
}