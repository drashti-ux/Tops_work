//  Calculate the Sum of Natural Numbers Using the While Loop

#include<stdio.h>
int main(){
    int num;
    printf("Enter Natural Numbers: ");
    scanf("%d",&num);
    int sum =0;
    int i = 1;
    while(i<=num){
        sum += i;
        i++;
    }
    printf("Sum Of %d Natural Numbers is %d",num,sum);
}