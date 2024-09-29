#include <stdio.h>

int factorial(int num){
    if(num<0){
        printf("factorial is defined only for non-negative integers\n");
        return 0;
    }
    else if(num == 1 || num == 0){
        printf(" %d = ",num);
        return 1;
    }
    else{
        printf("%d * ",num);
        int fact = num * factorial(num-1);
        return fact;
    }
    
}
int main(){
    int number;
    printf("Enter The Number Of Which You Want Factorial:");
    scanf("%d",&number);
    printf("%d",factorial(number));
}