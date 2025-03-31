// Accept month number and display month name


#include <stdio.h>
int main(){
    int month_number;
    printf("Enter The Month Number:");
    scanf("%d",&month_number);
    switch(month_number){
        case 1:{
            printf("%d.January",month_number);
            break;
        }
        case 2:{
            printf("%d.February",month_number);
            break;
        }
        case 3:{
            printf("%d.March",month_number);
            break;
        }
        case 4:{
            printf("%d.April",month_number);
            break;
        }
        case 5:{
            printf("%d.May",month_number);
            break;
        }
        case 6:{
            printf("%d.Jun",month_number);
            break;
        }
        case 7:{
            printf("%d.July",month_number);
            break;
        }
        case 8:{
            printf("%d.August",month_number);
            break;
        }
        case 9:{
            printf("%d.September",month_number);
            break;
        }
        case 10:{
            printf("%d.Octuber",month_number);
            break;
        }
        case 11:{
            printf("%d.November",month_number);
            break;
        }
        case 12:{
            printf("%d.December",month_number);
            break;
        }
        default:{
            printf("Enter Valid Month Number");
            break;
        }
    }

}