// Accept monthly salary from the user and deduct 10% insurance premium,
// 10% loan installment find out of remaining salary.

#include <stdio.h>
int main(){
    double salary;
    printf("Enter Your Monthly Income: ");
    scanf("%lf",&salary);
    double insurance_premium = (salary*10)/100;
    printf("your deducting insurance premium is : %.2lf \n",insurance_premium);
    double loan_installment = (salary*10)/100;
    printf("your loan installment is : %.2lf \n",loan_installment);
    double remaining_salary = salary - insurance_premium - loan_installment ;
    printf("your Remaning Salary is : %.2lf \n",remaining_salary);
}