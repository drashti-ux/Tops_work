// WAP to calculate swap 2 numbers with using of multiplication and division.

#include <stdio.h>
int main(){
    int n1 , n2;
    printf("Enter 1st Number: ");
    scanf("%d",&n1);
    printf("Enter 2nd Number: ");
    scanf("%d",&n2);
    printf("swap 2 numbers with using of multiplication and division\n");
    n1 = n1*n2;
    n2 = n1/n2;
    n1 = n1/n2;
    printf(" number 1 = %d \n number 2 = %d",n1,n2);
}