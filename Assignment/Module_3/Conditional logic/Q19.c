/*Write a program in C to calculate and print the electricity bill of a given customer. The customer ID, name, and unit consumed by the user should be captured from the keyboard to display the total amount to be paid to the customer. The charge are as follow : 
        Unit                                                  Charge/unit 
    upto 350                                                     @1.20 
    350 and above but less than 600                              @1.50 
    600 and above but less than 800                              @1.80    
    800 and above                                                @2.00   */ 


#include <stdio.h>
int main(){
    int customer_id;
    char customer_name[20];
    float consumed_units;
    float charge_per_unit;
    printf("Enter Customer Id:");
    scanf("%d",&customer_id);
    printf("Enter Customer Name:");
    scanf("%s",&customer_name);
    printf("Enter Consumed Units:");
    scanf("%f",&consumed_units);


    if(consumed_units > 0 && consumed_units < 350){
        charge_per_unit = 1.20;
        printf("Units  : @%.2f",consumed_units);
        float total = charge_per_unit * consumed_units; 
        printf("total = @%.2f",total);
    }
    else if(consumed_units >= 350 && consumed_units < 600){
        charge_per_unit = 1.50;
        printf("Units  : @%.2f",consumed_units);
        float total = charge_per_unit * consumed_units; 
        printf("total = @%.2f",total);
    }
    else if(consumed_units >= 600 && consumed_units < 800){
        charge_per_unit = 1.80;
        printf("Units  : @%.2f",consumed_units);
        float total = charge_per_unit * consumed_units; 
        printf("total = @%.2f",total);
    }
    else if(consumed_units >= 800){
        charge_per_unit = 2.00;
        printf("Units  : @%.2f",consumed_units);
        float total = charge_per_unit * consumed_units; 
        printf("total = @%.2f",total);
    }
    else{
        printf("Enter Valid units..");
    }

}