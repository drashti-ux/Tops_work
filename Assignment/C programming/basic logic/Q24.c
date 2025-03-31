// Accept 5 employees name and salary and count average and total salary

#include <stdio.h>
int main(){ 
    float salary[5];
    char name[5][100];
    float total_sal = 0;
    for(int i = 0;i<5;i++){
        printf("Enter Employee Name %d:",i+1);
        fgets(name[i], sizeof(name), stdin);
        printf("Enter salary of %s :",name[i]);
        scanf("%f",&salary[i]);
        getchar();
        total_sal += salary[i];
    }
    printf("Total Salary = %.2f \n",total_sal);
    float avg = total_sal/5;
    printf("Avarage Salary = %.2f",avg);
}