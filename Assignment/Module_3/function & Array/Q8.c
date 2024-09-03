// WAP to reverse a string and check that the string is palindrome or not

#include <stdio.h>
#include <string.h>
int main(){
    char str[50];
    printf("Enter String: ");
    fgets(str,sizeof(str),stdin);
    int len = strlen(str);
    char rev[50];
    int j = 0;
    for(int i = 0 ; i < len-2;i++){
        rev[j]=str[i];
        j++;
    }
    int rev_len = strlen(rev);
    for(int j = 0; j<rev_len;j++){
        printf("%s",rev);
    }
}