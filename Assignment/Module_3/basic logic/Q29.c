// Convert minutes into seconds and hours

#include<stdio.h>
int main(){
    int minutes;
    printf("Enter Minutes:");
    scanf("%d",&minutes);
    float hours = minutes/60;
    int seconds = minutes*60;
    printf("%d minutes = %d seconds",minutes,seconds);
    printf("%d minutes = %f hours",minutes,hours);
}