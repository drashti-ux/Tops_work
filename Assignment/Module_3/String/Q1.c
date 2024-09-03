// Write a program in C to find the length of a string without using library functions
#include <stdio.h>
#include <string.h>

int main(){
    char str[50];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int len = 0;
    
    while(str[len] !='\0'){
        if(str[len] == '\n'){
        str[len] ='\0';
        break;
    }
        len++;
    }
    printf("length Of The String: %d",len);
}