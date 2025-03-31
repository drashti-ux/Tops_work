// WAP of Addition, Subtraction, Multiplication and Division using Switch 
// case.(Must Be Menu Driven)


#include <stdio.h>
 int addition(int a,int b){
    int c = a+b;
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
 float division(int a,int b){
     if(b==0){
         printf("Enter valid number for division!!");
         return 0;
     }
         float c =  a/b;
         return c;
 }
 
int main(){
    int num1,num2;
    int choice;
    printf("1:Addition \n2.Substraction \n3.Multplication \n4.Division \n");
    printf("Which Action you want to perform:");
    scanf("%d",&choice);
    printf("Enter Number 1:");
    scanf("%d",&num1);
    printf("Enter Number 2:");
    scanf("%d",&num2);
    switch(choice){
        case 1:{
            printf("Addition of Given Two Numbers:%d",addition(num1,num2));
            break;
        }
        case 2:{
            printf("substraction of Given Two Numbers:%d",substraction(num1,num2));
            break;
        }
        case 3:{
            printf("multiplication of Given Two Numbers:%d",multiplication(num1,num2));
            break;
        }
        case 4:{
            printf("division of Given Two Numbers:%.2f",division(num1,num2));
            break;
        }
        default:{
            printf("Enter valid choice operation");
            break;
        }
    }
}