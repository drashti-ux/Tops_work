// Write a program in C to remove characters from a string except alphabets.

#include <stdio.h>
#include <string.h>
int main(){
    char str[50];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int len = strlen(str);
    for(int i = 0;i<len;i++){
        if(!str[i] >='a' && str[i] <='z'){
            str[i]=str[i+1];
        }
    }
}