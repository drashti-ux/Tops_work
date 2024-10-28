// Write a program you have to make a summation of first and last Digit. (E.g., 1234 Ans: -5)

#include<stdio.h>
int main (){
    int num;
    int summation = 0;
    printf("Enter the number of which have to Summation: ");
    scanf("%d",&num);

int lastdegit = num%10;

    while(num >= 10){ 
        num = num/10;
    }
    summation = num + lastdegit;
        printf("Summation Of Number : %d",summation);
}