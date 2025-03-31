// Write a program in C to print individual characters of a string in reverse order 

#include<stdio.h>
#include <string.h>
int main(){
    char str[50];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int len = strlen(str);
    printf("In Reverse:");
    for(int i = len-2;i>=0;i--){
        printf("%c ",str[i]);
    }
}