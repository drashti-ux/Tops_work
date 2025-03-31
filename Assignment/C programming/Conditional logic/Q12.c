// WAP to find maximum number among 3 numbers using ternary operator

#include<stdio.h>
int main(){
    int num1,num2,num3;
    printf("enter num 1:");
    scanf("%d",&num1);
    printf("enter num 2:");
    scanf("%d",&num2);
    printf("enter num 3:");
    scanf("%d",&num3);
    (num1>num2)?(num1>num3)?printf("num 1 is maximum"):printf("num 3 is maximum"):(num2>num3)?printf("num 2 is maximum"):printf("num 3 is maximum");
}
