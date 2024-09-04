// WAP to reverse a string and check that the string is palindrome or not

#include <stdio.h>
#include <string.h>
int main(){
    char str[50];
    printf("Enter String: ");
    scanf("%s",str);
    int len = strlen(str);
    // printf("%d\n",len);
    char rev[50];
    int j = 0;
    for(int i = len-1 ; i >= 0;i--){
        rev[j]=str[i];
        j++;
    }
     rev[j] = '\0';
    int rev_len = strlen(rev);
    printf("Reverse : %s\n",rev);
    
    int result = strcmp(str, rev);
    // printf("%d",result);
    if(result == 0){
         printf("Palindrom");
    }
    else{
        printf("Not Palindrom");
    }
}