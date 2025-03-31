// Accept the input month number and print number of days in that month.

#include<stdio.h>
int main(){
    int month;
    
    printf("Enter Month Number:");
    scanf("%d",&month);
    if((month>0 && month <8 && month %2 !=0) || (month >=8 && month <= 12 && month %2 == 0)){
        printf("in This month there Are 31 days \n");
    }
    else if(month == 2){
        printf("in this month there Are 28 days \n");
    }
    else if(month < 0 || month > 12){
        printf("Enter valid month \n");
    }
    else {
        printf("in this month there are 30 days \n");
    }
}