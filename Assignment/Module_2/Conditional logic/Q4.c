// WAP to make simple calculator (operation include Addition, Subtraction, Multiplication, Division, modulo) using conditional statement

#include<stdio.h>
int main(){
    float num1,num2;
    int choice;
    printf("1:Addition \n2.Substraction \n3.Multplication \n4.Division \n5.Modulo\n");
    printf("Which Action you want to perform:");
    scanf("%d",&choice);
    printf("Enter Number 1:");
    scanf("%f",&num1);
    printf("Enter Number 2:");
    scanf("%f",&num2);
    switch(choice){
        case 1:{
            int sum = num1 + num2;
            printf("Addition of %.2f and %.2f is %.d",num1,num2,sum);
            break;
        }
        case 2:{
            int sub = num1 - num2;
            printf("Substraction of %.2f and %.2f is %d",num1,num2,sub);
            break;
        }
        case 3:{
            int mul = num1 * num2;
            printf("Multiplication of %.2f and %.2f is %d",num1,num2,mul);
            break;
        }
        case 4:{
            float div = num1 / num2;
            printf("Division of %.2f and %.2f is %.2f",num1,num2,div);
            break;
        }
        case 5:{
            int mod = num1 % num2;
            printf("Modulo of %.2f and %.2f is %d",num1,num2,mod);
            break;
        }
        default:{
            printf("Enter valid choice operation");
            break;
        }
    }
}