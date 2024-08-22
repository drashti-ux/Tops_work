// WAP to input the week number and print week day. 

#include <stdio.h>
int main(){
    int week_number;
    printf("Enter The Week Number:");
    scanf("%d",&week_number);
    switch(week_number){
        case 1:{
            printf("%d.Sunday",week_number);
            break;
        }
        case 2:{
            printf("%d.Monday",week_number);
            break;
        }
        case 3:{
            printf("%d.Tuesday",week_number);
            break;
        }
        case 4:{
            printf("%d.Wednesday",week_number);
            break;
        }
        case 5:{
            printf("%d.Thursday",week_number);
            break;
        }
        case 6:{
            printf("%d.Friday",week_number);
            break;
        }
        case 7:{
            printf("%d.Saturday",week_number);
            break;
        }
        default:{
            printf("Enter Valid Week Number");
            break;
        }
    }

}