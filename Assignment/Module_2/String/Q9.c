// Write a program in C to find the maximum number of characters in a string.

#include <stdio.h>
int main(){
    char str[50];
    printf("Enter String: ");
    fgets(str,sizeof(str),stdin);
    int ch = 0;
    while(str[ch] != '\0' && str[ch] != '\n'){
        ch++;
    }
    printf("The Maximum Number Of Characters in String :%d ",ch);
}