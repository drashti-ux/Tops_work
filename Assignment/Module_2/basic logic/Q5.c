// Find Area of Cube formula : a = 6a2

#include <stdio.h>
#include <math.h>
float redious;
int main(){
    printf("Enter redious of cube: ");
    scanf("%f",&redious);
    float Area = 6*pow(redious,2);
    printf("Area of cube is : %.2f ",Area);
}