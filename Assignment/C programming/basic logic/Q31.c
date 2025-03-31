// Convert kilometers into meters

#include<stdio.h>
int main(){
    float km;
    printf("Enter numbers of kilometer:");
    scanf("%f",&km);
    int m = km*1000;
    printf("%.2f kilometer = %d meter",km,m);
}