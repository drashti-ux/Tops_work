// Accept 2 numbers and find out its sum check it size

#include<stdio.h>
int main(){
    int num1,num2;
    printf("Enter Number 1:");
    scanf("%d",&num1);
    printf("Enter Number 2:");
    scanf("%d",&num2);
int sum = num1+num2;
printf("sum of %d and %d is %d and size of sum is %d bytes",num1,num2,sum,sizeof(sum));
}