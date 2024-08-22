// Accept 2 numbers from user and swap 2 numbers with using 3rd variable
// and without using 3rd variable

// Online C compiler to run C program online
#include <stdio.h>
int main(){   
    int number1,number2,temp;
    printf("Enter 1st Number:");
    scanf("%d",&number1);
    printf("Enter 2nd Number:");
    scanf("%d",&number2);
    
    printf("Swap two number using third variable \n");
    temp = number1;
    number1 = number2;
    number2 = temp;
    printf(" number1= %d \n number2= %d \n\n\n",number1,number2);
// ----------------------------------------------------------------
    printf("swap without using third variable \n");
    number1 = number1 + number2;
    number2 = number1 - number2;
    number1 = number1 - number2;
    printf(" number1= %d \n number2: %d \n",number1,number2);
}