// WAP to find reverse of string using recursion

#include<stdio.h>
#include<string.h>
void reverse
int main(){
    char str[50];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int len = strlen(str);
    printf("%s %d",str,len);
    
    if(str[len]=='\n'){
        str[len]='\0';
            len--;
        }
    printf("%s %d",str,len-1);
    
}