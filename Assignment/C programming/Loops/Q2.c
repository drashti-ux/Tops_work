// WAP to accept 5 numbers from user and display all numbers

#include <stdio.h>
int main(){
    int num[5];
    for(int i=0; i <5 ;i++){
        printf("Enter Number %d : ",i+1);
        scanf("%d",&num[i]);
    }
    int len = sizeof(num)/sizeof(num[0]);
    printf("--------------------\n");
    for(int j = 1 ;j <= len;j++){
        printf("number %d : %d \n", j ,num[j-1]);
    }
}