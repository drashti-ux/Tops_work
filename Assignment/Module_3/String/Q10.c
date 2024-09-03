// Write a program in C to extract a substring from a given string 

#include <stdio.h>
#include <string.h>
int main(){
    char str[50];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    char substr[50];
    int start_idx,end_idx;
    printf("Enter Start Index of substring:");
    scanf("%d",&start_idx);
    printf("Enter Ending index of substring:");
    scanf("%d",&end_idx);
    if(start_idx < 0){
        printf("Invalid start index");
    }
    else if(end_idx >= strlen(str)){
         printf("Invalid End index");
    }
    else{
    int j = 0;
    for(int i = start_idx;i<=end_idx;i++){
        substr[j]=str[i];
        j++;
    }
    printf("%s",substr);
    }
}