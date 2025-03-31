// Write a program in C to compare two strings without using string library functions.

#include <stdio.h>

int main(){
    char str1[50];
    char str2[50];
    printf("Enter String 1:");
    fgets(str1,sizeof(str1),stdin);
    printf("Enter String 2:");
    fgets(str2,sizeof(str2),stdin);
    int len1 =0;
    while(str1[len1] != '\0' && str1[len1] != '\n'){
        len1++;
    }
    int len2 =0 ;
    while(str2[len2] != '\0' && str2[len2] != '\n'){
        len2++;
    }
    
    int minLen = len1 < len2 ? len1 : len2;
    int res;
    for(int i = 0;i<=minLen;i++){
        if(str1[i] == str2[i]){
            res = str1[i] - str2[i];
            continue;
        }
        else{
            res = str1[i] - str2[i];
            break;
        }
    }
    
    printf("%d",res);
}