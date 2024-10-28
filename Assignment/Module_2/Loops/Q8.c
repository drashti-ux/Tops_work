// Write a program to find out the max from given number (E.g., No: -1562 Max number is 6)

#include<stdio.h>
int main (){
    int num;
    int max = 0;
    printf("Enter the number of which have to reverse: ");
    scanf("%d",&num);

    while(num != 0){
        int reminder = num%10;
        if(reminder > max){
           max = reminder; 
        }
        num = num/10;
    }
        printf("Max in Number : %d",max);
}