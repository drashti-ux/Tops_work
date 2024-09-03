// Online C compiler to run C program online
#include <stdio.h>
#include <string.h>
int main(){
    char str1[50];
    char str2[50];
    printf("Enter String 1:");
    fgets(str1,sizeof(str1),stdin);
    printf("Enter String 2:");
    fgets(str2,sizeof(str2),stdin);
    int len1 = strlen(str1);
    int len2 = strlen(str2);
    int minLen = len1 < len2 ? len1 : len2;
    str1[strcspn(str1, "\n")] = '\0';
    str2[strcspn(str2, "\n")] = '\0';
    int res;
    for(int i = 0;i<minLen;i++){
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