/// .Calculate compound interest (Compound Interest formula:
// a. Formula to calculate compound interest annually is given by:
// Amount= P(1 + R/100)t
// b. Compound Interest = Amount – P
// Calculate compound interest

#include <stdio.h>
#include <math.h>
int main(){
    float amount,principle_amount,rate,t;
    printf("Enter The Principle Amount :");
    scanf("%f",&principle_amount);
    printf("Enter Annual Interest Rate :");
    scanf("%f",&rate);
    printf("Enter  The number of years the money is invested :");
    scanf("%f",&t);
    amount = principle_amount *pow(1+rate/100,t);
    float compound_interest = amount - principle_amount;
    printf("Compound interest = %.2f",compound_interest);
}

