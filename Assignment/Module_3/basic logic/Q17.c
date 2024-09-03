// Calculate person’s insurance premium based on salary 

#include<stdio.h>
int main(){
    int salary;
    float rate;
    printf("Enter Your Salary:");
    scanf("%d",&salary);
    printf("Enter Premium Rate(in percentage):");
    scanf("%f",&rate);
    float insurance_premimum = (salary*rate)/100;
    printf("insurance Premium = %.2f",insurance_premimum);
}