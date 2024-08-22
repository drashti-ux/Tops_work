// Write a program in C to read any Month Number in integer and display the 
// number of days for this month.

#include<stdio.h>
int main(){
    int month;
    
    printf("Enter Month Number:");
    scanf("%d",&month);
    if((month>0 && month <8 && month %2 !=0) || (month >=8 && month <= 12 && month %2 == 0)){
        printf("in This month there is 31 days \n");
    }
    else if(month == 2){
        printf("in this month there is 28 days \n");
    }
    else if(month < 0 || month > 12){
        printf("Enter valid month \n");
    }
    else {
        printf("in this month there are 30 days \n");
    }
}