// Write a program make a summation of given number (E.g., 1523 Ans: -11) 

#include<stdio.h>
int main (){
    int num;
    int summation = 0;
    printf("Enter the number of which have to Summation: ");
    scanf("%d",&num);

int reminder = num%10;

    while(num != 0){
        int reminder = num%10;
        summation += reminder; 
        num = num/10;
    }
        printf("Summation Of Number : %d",summation);
}