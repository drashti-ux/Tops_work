// Convert temperature Fahrenheit to Celsius

#include<stdio.h>

int main(){
    float Fahrenheit;
    printf("Enter the temperature in Fahrenheit :");
    scanf("%f",&Fahrenheit);
    float Celsius = (Fahrenheit-32)*5/9;
    printf("%f Fahrenheit = %f Celsius",Fahrenheit,Celsius);
}