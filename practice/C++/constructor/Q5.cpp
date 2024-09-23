// wap of c++ to find average of two,three,four numbers using constructor overloading

#include <iostream>
using namespace std;
class average{
    public:
    int avg;
    average(int num1,int num2){
        avg = (num1+num2)/2;
        cout<<"Two Numbers ";
    }
    average(int num1,int num2,int num3){
        avg = (num1+num2+num3)/3;
        cout<<"Three Numbers ";
    }
    average(int num1,int num2,int num3,int num4){
        avg = (num1+num2+num3+num4)/4;
        cout<<"Four Numbers ";
    }
    void display(){
        cout<<"Average : "<<avg<<endl;
    }
};
int main(){
        average av2(5,4);
        av2.display();
        average av3(6,8,3);
        av3.display();
        average av4(2,9,8,5);
        av4.display();
}