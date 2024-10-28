// WAP to print number in reverse order e.g.: number = 64728 ---> reverse = 82746

#include<stdio.h>
int main (){
    int num;
    int reverse = 0;
    printf("Enter the number of which have to reverse: ");
    scanf("%d",&num);

    while(num != 0){
        int reminder = num%10;
        reverse = reverse *10 + reminder;  
        num = num/10;
    }
        printf("Number In Reverse order: %d",reverse);
}