// Find circumference of Triangle formula : triangle = a + b + c

#include<stdio.h>
int main(){
    float a, b, c;
    printf("Enter length of side 1: ");
    scanf("%f",&a);
    printf("Enter length of side 2: ");
    scanf("%f",&b);
    printf("Enter length of side 3: ");
    scanf("%f",&c);
    float circumference = a+b+c;
    printf("circumference of Triangle is : %.2f",circumference);
}