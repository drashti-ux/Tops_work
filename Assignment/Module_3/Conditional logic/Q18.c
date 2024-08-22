// Write a C program to calculate profit and loss on a transaction. 

#include <stdio.h>
int main(){
    float original_price , selling_price;
        printf("Enter The Original Price:");
        scanf("%f",&original_price);
        printf("Enter The Selling Price:");
        scanf("%f",&selling_price);

        float profit_loss = original_price - selling_price;

        if(profit_loss > 0){
            printf("You Have Profit of %.2f",profit_loss);
        }
        else if(profit_loss < 0 ){
            printf("You Have Loss of %.2f",-profit_loss);
        }
        else{
            printf("You Have No Profit Or No Loss");
        }
}