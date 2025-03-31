// .WAP to find number is even or odd using ternary operator

#include<stdio.h>
int main(){
    int num;
    printf("Enter Any Number:");
    scanf("%d",&num);
    (num%2==0)?printf("The number %d is Even",num):printf("The number %d is odd",num);
}