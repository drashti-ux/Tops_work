// Write a C program to input basic salary of an employee and calculate its 
// Gross salary according to following: 
// Basic Salary <= 10000 : HRA = 20%, DA = 80% 
// Basic Salary <= 20000 : HRA = 25%, DA = 90% 
// Basic Salary > 20000 : HRA = 30%, DA = 95%

#include <stdio.h>
int main(){
    float basic_salary,gross_salary;
    printf("Enter Your Basic Salary:");
    scanf("%f",&basic_salary);

    if(basic_salary <= 10000){
        float HRA = (basic_salary*20)/100;
        float DA = (basic_salary*80)/100;
        gross_salary = basic_salary + HRA + DA;
        printf("Gross Salary = %.2f",gross_salary);
    }
    else if(basic_salary <= 20000){
        float HRA = (basic_salary*25)/100;
        float DA = (basic_salary*90)/100;
        gross_salary = basic_salary + HRA + DA;
        printf("Gross Salary = %.2f",gross_salary);
    }
    else{
        float HRA = (basic_salary*30)/100;
        float DA = (basic_salary*90)/100;
        gross_salary = basic_salary + HRA + DA;
        printf("Gross Salary = %.2f",gross_salary);
    }
}