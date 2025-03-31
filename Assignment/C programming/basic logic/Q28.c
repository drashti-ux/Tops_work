// Convert years into days and months

#include <stdio.h>
int main(){
    int years;
    printf("Enter years:");
    scanf("%d",&years);
    int days = years*365;
    printf("%d years = %d days\n",years,days);
    int months = years*12;
    printf("%d years = %d month\n",years,months);
}