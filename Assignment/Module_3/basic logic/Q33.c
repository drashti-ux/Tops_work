// C Program to Read Integer and Print First Three Powers (N^1, N^2, N^3)

#include<stdio.h>
int main(){
    int num;
    printf("enter number:");
    scanf("%d",&num);
    int n_power2 = num*num;
    int n_power3 = num*num*num;
    printf("first three powers of %d is %d,%d,%d",num,num,n_power2,n_power3);
}