// WAP to Find Area And Circumference of Circle

#include <stdio.h>
float PI = 3.14;
int main(){
    float redious;
    printf("Enter redious of circle : ");
    scanf("%f",&redious);
    float Area = PI*redious*redious;
    float Circumference = 2*PI*redious;
    printf("Area of the circle is %.2f \n",Area);
    printf("Circumference of the circle is %.2f ",Circumference);
return 0;
}