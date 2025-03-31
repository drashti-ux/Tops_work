//4. Find Area of Square formula : a = a2

#include <stdio.h>
#include <math.h>
int main(){
    float length;
    printf("Enter length of square : ");
    scanf("%f",&length);
    float Area = pow(length,2);
    printf("Area of the square is %.2f \n",Area);
return 0;
}