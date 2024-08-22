// Find Area of Cube formula : a = 6a2

#include <stdio.h>
float redious;
int main(){
    printf("Enter redious of cube: \n");
    scanf("%f",&redious);
    float Area = 6*redious*redious;
    printf("Area of cube is : %.2f ",Area);
}