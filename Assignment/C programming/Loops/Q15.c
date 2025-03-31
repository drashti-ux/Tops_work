// Calculate sum of 10 numbers using of while loop

#include<stdio.h>
int main(){
    int num;
    
    int sum =0;
    int i = 1;
    while(i<=10){
        printf("Enter Number %d: ",i);
        scanf("%d",&num);
        sum += num;
        i++;
    }
    printf("Sum Of Entered 10 Numbers is %d",sum);
}