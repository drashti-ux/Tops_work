// WAP to find minimum number among 3 numbers using ternary operator

#include<stdio.h>
int main(){
    int num1,num2,num3;
    printf("enter num 1:");
    scanf("%d",&num1);
    printf("enter num 2:");
    scanf("%d",&num2);
    printf("enter num 3:");
    scanf("%d",&num3);
    (num1<num2)?(num1<num3)?printf("num 1 is minimum"):printf("num 3 is minimum"):(num2<num3)?printf("num 2 is minimum"):printf("num 3 is minimum");
}