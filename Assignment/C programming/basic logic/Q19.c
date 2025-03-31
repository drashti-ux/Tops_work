// Calculate compound interest

#include <stdio.h>
#include <math.h>
int main(){
    float amount,principle_amount,rate,n,t;
    printf("Enter The Principle Amount :");
    scanf("%f",&principle_amount);
    printf("Enter Annual Interest Rate :");
    scanf("%f",&rate);
    printf("Enter The number of times that interest is compounded per year :");
    scanf("%f",&n);
    printf("Enter  The number of years the money is invested :");
    scanf("%f",&t);
    amount = principle_amount *pow(1+rate/n,n*t);
    printf("Compound interest = %.2f",amount);
}