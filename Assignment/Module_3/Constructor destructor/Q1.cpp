// Write a program to find the multiplication values and the cubic values using inline function 

#include <iostream>
using namespace std;
inline void multiplication(){
    cout<<"For Multiplication"<<endl;
    int num1,num2;
    cout<<"Enter Num1:";
    cin>>num1;
    cout<<"Enter Num1:";
    cin>>num2;
    int mul = num1*num2;
    cout<<"Multiplication of Numbers : "<<mul<<endl;
}
inline void cubic(){
    cout<<"For Cube"<<endl;
    int num;
    cout<<"Enter Number:";
    cin>>num;
    int cube = num*num*num;
    cout<<"cube of Number : "<<cube<<endl;
}
int main(){
        multiplication();
        cubic();
}