// Accept 5 employees name and salary and count average and total salary

#include <stdio.h>
int main(){
    
    double total_salary = 0;
    for(int i = 1;i<=5;i++){
        double salary;
        printf("Employee %d ",i );
        printf("Enter your Name:");
        printf("Enter Your Salary:");
        scanf("%lf",&salary);
        double total_salary = total_salary + salary;
        printf(" totle salary = %lf",total_salary);
    }
}