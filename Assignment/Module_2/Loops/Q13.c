// calculate the Factorial of a Given Number using while loop

#include <stdio.h>

int main() {
    int num;
    printf("Enter The Number Of Which You Want To Find Factorial:");
    scanf("%d",&num);
    int factorial = 1;
    int i = 1;
    while(i <= num){
        factorial *= i;
        i++;
    }
printf("%d factorial = %d",num ,factorial);
    return 0;
}