// Accept 5 expense from user and find average of expense

#include <stdio.h>
int main(){
    float expence[5];
    float total_expence = 0;
    for(int i = 0; i < 5 ; i++){
        printf("Enter Expence %d:",i+1);
        scanf("%f",&expence[i]);
        total_expence += expence[i];
    }
    float avg = total_expence / 5;
    printf("Average of Expence = %.2f",avg);
}