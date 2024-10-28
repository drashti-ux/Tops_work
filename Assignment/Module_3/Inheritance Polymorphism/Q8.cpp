// Write a program to Mathematic operation like Addition, Subtraction, Multiplication,  Division  Of  two  number  using  different  parameters  and Function Overloading

#include <iostream>
using namespace std;
class Math{
    public:
    int add,sub,mul;
    float div;
    int Addition(int num1,int num2){
       cout<<"Integer Method Is Called."<<endl;
       int add = num1+num2;
        return add;
    }
    int Substraction(int num1,int num2){
       int sub = num1 - num2;
        return sub;
    }
    int Multiplication(int num1,int num2){
       int mul = num1 * num2;
        return mul;
    }
    int Division(int num1,int num2){
       int div = float(num1/num2);
        return div; 
    }
    // overloaded methods 
    double Addition(float num1,float num2){
       cout<<"Double Method is Called"<<endl;
       double add = num1+num2;
        return add;
    }
    double Substraction(float num1,float num2){
       double sub = num1 - num2;
        return sub;
    }
    double Multiplication(float num1,float num2){
       double mul = num1 * num2;
        return mul;
    }
    double Division(float num1,float num2){
       double div = num1 / num2;
       return div;
    }
};
int main(){
    float n1,n2;
    int n3,n4;
    Math m1;
    cout<<"Enter Num 1:";
    cin>>n1;
    n3 = (int)n1;
    cout<<"Enter Number 2 :";
    cin>>n2;
    n4 = (int)n2;
    cout<<"Addition = "<<m1.Addition(n1,n2)<<endl;
    cout<<"SubStraction = "<<m1.Substraction(n1,n2)<<endl;
    cout<<"Multiplication = "<<m1.Multiplication(n1,n2)<<endl;
    cout<<"Division = "<<m1.Division(n1,n2)<<endl<<endl;
    
    // to call integer Method call
    cout<<"Addition = "<<m1.Addition(n3,n4)<<endl;
    cout<<"SubStraction = "<<m1.Substraction(n3,n4)<<endl;
    cout<<"Multiplication = "<<m1.Multiplication(n3,n4)<<endl;
    cout<<"Division = "<<m1.Division(n3,n4)<<endl;

}