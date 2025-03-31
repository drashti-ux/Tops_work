// WAP to print factorial of given number

#include <stdio.h>
int main(){
    int num;
    printf("Enter The Number Of Which You Want Factorial:");
    scanf("%d",&num);
    int factorial = 1;
    if(num < 0){
        printf("factorial is defined only for non-negative integers");
    }
    else{
    for(int i = num; i>1 ; i--){
        factorial *= i;
    }
    printf("Factorial of %d = %d",num,factorial);
        
    }
}