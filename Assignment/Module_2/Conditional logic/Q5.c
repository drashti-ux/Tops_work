// Check Number Is Positive or Negative

#include <stdio.h>
int main()
{
    int num;
    printf("enter Number:");
    scanf("%d", &num);
    if(num>0) {
        printf("The Number %d is Positive",num);
    } else if(num<0) {
        printf("The Number %d is Negative",num);
    } else {
        printf("The Number %d is Zero",num);
    }
}