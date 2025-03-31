// WAP to find factorial using recursion 

#include <stdio.h>
int factorial(int n){
    int fact;
    if(n==1 || n == 0){
        fact = 1;
    }
    else{
        fact = n*factorial(n-1);
    }
}
int main(){
    int num;
    printf("Enter The Number Of Which You Want Factorial:");
    scanf("%d",&num);
    printf("%d Factorial = %d",num,factorial(num));
}