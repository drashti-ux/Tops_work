// Write a program in C to copy one string to another string. 

#include <stdio.h>
#include <string.h>
int main(){
    char str[20];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    char str2[20];
    strcpy(str2,str);
    printf("String 1 : %sString 2: %s",str,str2);
}
