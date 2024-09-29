// Write a program of Addition, Subtraction, Division, Multiplication using constructor.

#include <iostream>
using namespace std;
class addition{
    public:
    int add;
    addition(){
        int num1,num2;
        cout<<"Enter num 1 :";
        cin>>num1;
        cout<<"Enter num 2 :";
        cin>>num2;
        add = num1 + num2;
        cout<<"Addition of "<<num1<<" & "<<num2<<" = "<<add<<endl;
    }
};
class Subtraction{
    public:
    int sub;
    Subtraction(){
        int num1,num2;
        cout<<"Enter num 1 :";
        cin>>num1;
        cout<<"Enter num 2 :";
        cin>>num2;
        sub = num1 - num2;
        cout<<"Subtraction of "<<num1<<" & "<<num2<<" = "<<sub<<endl;
    }
};
class Multiplication{
    public:
    int mul;
    Multiplication(){
        int num1,num2;
        cout<<"Enter num 1 :";
        cin>>num1;
        cout<<"Enter num 2 :";
        cin>>num2;
        mul = num1 * num2;
        cout<<"Multiplication of "<<num1<<" & "<<num2<<" = "<<mul<<endl;
    }
};
class Division{
    public:
    float div;
    Division(){
        int num1,num2;
        cout<<"Enter num 1 :";
        cin>>num1;
        cout<<"Enter num 2 :";
        cin>>num2; 
        if (num2 != 0) {
            div = num1 / num2;  // Proper float division
            cout << "Division of " << num1 << " & " << num2 << " = " << div << endl;
        }
    }
};
int main(){
    int ch;
        cout<<"1.Addition"<<endl<<"2.Substraction"<<endl<<"3.Multiplication"<<endl<<"4.Division"<<endl;
        cout<<"Enter Your Choice:";
        cin>>ch;
        switch(ch){
            case 1:{
                addition obj1;
                break;
            }
            case 2:{
                Subtraction obj2;
                break;
            }
            case 3:{
                Multiplication obj3;
                break;
            }
            case 4:{
                 Division obj4;
                break;
            }
            default:
                cout<<"Enter Valid Choice";
        }
}