// Find area of Triangle Formula : A = 1/2 × b × h

#include <stdio.h>
int main(){
    float b;
    float h;
    printf("Enter the base of triangle: ");
    scanf("%f",&b);
    printf("Enter the height of triangle: ");
    scanf("%f",&h);
    float Area = 0.5*b*h;
    printf("Area of Triangle is :%.2f",Area);
}