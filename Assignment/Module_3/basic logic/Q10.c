// find the area of a rectangular prism formula : A=2(wl+hl+hw)

#include <stdio.h>
int main(){
    float l, h, w;
    printf("Enter Length of Rectangular Prism : ");
    scanf("%f",&l);
    printf("Enter Height of Rectangular Prism : ");
    scanf("%f",&h);
    printf("Enter Width of Rectangular Prism : ");
    scanf("%f",&w);
    float Area = 2*(w*l+h*l+h*w);
    printf("Area of a Rectangular Prism : %.2f",Area);
}