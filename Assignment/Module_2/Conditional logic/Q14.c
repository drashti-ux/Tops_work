// WAP to find the largest of three numbers.

#include<stdio.h>
int main()
{
    int num1,num2,num3;
    printf("enter num 1:");
    scanf("%d",&num1);
    printf("enter num 2:");
    scanf("%d",&num2);
    printf("enter num 3:");
    scanf("%d",&num3);
    if(num1>num2) {
        if(num1>num3) {
            printf("num 1 is maximum");
        } else {
            printf("num 3 is maximum");
        }
    } else {
        if(num2>num3) {
            printf("num 2 is maximum");
        } else {
            printf("num 3 is maximum");
        }
    }
}