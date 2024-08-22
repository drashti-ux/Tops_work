// Find circumference of Rectangle formula : C = 4 * a

#include <stdio.h>
int main(){
    float l,w;
    printf("Enter length of Rectangle:");
    scanf("%f",&l);
    printf("Enter Width of Rectangle: ");
    scanf("%f",&w);
    float circumference = 2*(l*w);
    printf("circumference of Rectangle is : %.2f", circumference);
}