// WAP to create simple calculator using class

#include <iostream>
using namespace std;
class calculator{
 public:
    int addition(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
    int substraction(int num1,int num2){
        int sub = num1-num2;
        return sub;
    }
    int multiplication(int num1,int num2){
        int mul = num1*num2;
        return mul;
    }
    float division(int num1,int num2){
        if(num2 == 0){
            cout<<"Error!Division By Zero."<<endl;
            return 0;
        }
            float div =(float)num1/num2;
            return div; 
    }
    int reminder(int num1,int num2){
        if(num2 == 0){
            cout<<"Error!Division By Zero."<<endl;
            return 0;
        }
           int rem = num1%num2;
        return rem; 
    }
    
};
int main(){
    int num1,num2;
    char ch; 
    cout<<"Enter Num 1 & Num 2:";
    cin>>num1>>num2;
    cout<<"Enter Operator(+,-,*,/,%):";
    cin>>ch;
    calculator obj;
    switch (ch)
    {
    case '+':
        cout<<"addition of given numbers:"<<obj.addition(num1,num2);
        break;
    case '-':
        cout<<"substraction of given numbers:"<<obj.substraction(num1,num2);
        break;
    case '*':
        cout<<"multiplication of given numbers:"<<obj.multiplication(num1,num2);
        break;
    case '/':
        cout<<"division of given numbers:"<<obj.division(num1,num2);
        break;
    case '%':
        cout<<"reminder of given numbers:"<<obj.reminder(num1,num2);
        break;
    default:
    cout<<"enter valid choice";
        break;
    }

}