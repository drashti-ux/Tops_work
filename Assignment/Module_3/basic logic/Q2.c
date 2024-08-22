// Write a program to make Simple calculator (to make addition, subtraction,multiplication, division and modulo)

#include <stdio.h>
 int addition(int a,int b){
    int c = a+b;
    printf("%d",c);
    return c;
 }
 int substraction(int a,int b){
    int c = a-b;
    return c;
 }
 int multiplication(int a,int b){
    int c = a*b;
    return c;
 }
 float division(float a,float b){
     if(b==0){
         printf("Enter valid number for division!!");
         return 0;
     }
         float c =  a/b;
         return c;
 }
 int modulo(int a,int b){
     if(b==0){
         printf("Enter valid number for find Modulo!!");
         return 0;
     }
         int c = a%b;
         return c;
 }
 
int main(){
    int num1,num2;
        printf("Enter Number 1:");
        scanf("%d",&num1);
        printf("Enter Number 2:");
        scanf("%d",&num2);
        printf("Addition:%d\n",addition(num1,num2));
        printf("substraction:%d\n",substraction(num1,num2));
        printf("multiplication:%d\n",multiplication(num1,num2));
        printf("division:%.2f\n",division(num1,num2));
        printf("remainder:%d\n",modulo(num1,num2));
    return 0;
}
