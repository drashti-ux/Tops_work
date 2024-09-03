/*Write a program in C to calculate and print the electricity bill of a given customer. The customer ID, name, and unit consumed by the user should be captured from the keyboard to display the total amount to be paid to the customer. The charge are as follow : 
        Unit                                                  Charge/unit 
    upto 350                                                     @1.20 
    350 and above but less than 600                              @1.50 
    600 and above but less than 800                              @1.80    
    800 and above                                                @2.00   

If bill exceeds Rs. 800 then a surcharge of 18% will be charged and the minimum bill should be of Rs. 256/- */ 


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
    }
    else if(consumed_units >= 350 && consumed_units < 600){
        charge_per_unit = 1.50;   
    }
    else if(consumed_units >= 600 && consumed_units < 800){
        charge_per_unit = 1.80;   
    }
    else if(consumed_units >= 800){
        charge_per_unit = 2.00;   
    }
    else{
        printf("Enter Valid units..");
    }

        printf("Units  : @%.2f\n",consumed_units);
        float bill = charge_per_unit * consumed_units; 
        float surface_charge;
        printf("Bill charge = %.2f \n",bill);
        if(bill > 800){
            surface_charge = (bill*18)/100;
            printf("surface charge = %f\n",surface_charge);
        }
        else{
            surface_charge = 0;
            printf("surface charge = %.f\n",surface_charge);
        }
        printf("total = @%.2f",bill+surface_charge);

}