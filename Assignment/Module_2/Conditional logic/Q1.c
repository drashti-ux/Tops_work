// Write a C program to accept two integers and check whether they are equal or not

#include <stdio.h>
int main(){
    int num1,num2;
    printf("Enter number 1: ");
    scanf("%d",&num1);
    printf("Enter number 2: ");
    scanf("%d",&num2);
    if(num1 == num2){
        printf("both num1 %d and num2 %d are equal",num1,num2);
    }
    else{
        printf("both num1 %d and num2 %d not equal",num1,num2);
    }
}