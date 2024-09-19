// wap for function with call by value

#include <iostream>
using namespace std;
void add(int num1,int num2){
    num1 += 5;
    num2 += 10;
    cout<<"Addtion value : A = "<<num1<<" B = "<<num2<<endl;
}
int main() {
    int a,b;
    cout<<"Enter num 1: ";
    cin>>a;
    cout<<"Enter num 2: ";
    cin>>b;
    cout<<"before updating value : A = "<<a<<" B = "<<b<<endl;
    add(a,b);
    cout<<"after updating value : A = "<<a<<" B = "<<b<<endl;

}