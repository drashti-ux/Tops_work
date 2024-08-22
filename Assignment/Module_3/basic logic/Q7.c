// Find area of Rectangle Formula : A=wl

#include<stdio.h>
int main(){
    float w;
    float l;
    printf("Enter width of rectangle:");
    scanf("%f",&w);
    printf("Enter length of rectangle:");
    scanf("%f",&l);
    float Area = w*l;
    printf("Area of Rectangle %.2f",Area);
}