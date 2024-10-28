// Calculate person’s Annual salary 

#include <stdio.h>
int main(){
    int mon_sal;
    printf("Enter Your Monthly Salary:");
    scanf("%d",&mon_sal);
    int annual_sal = mon_sal * 12;
    printf("Your Annual Salary : %d",annual_sal);
}