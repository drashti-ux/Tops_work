//write a program using constructor to multiply three numbers 
#include <iostream>
using namespace std;
class multiply{
    public:
    int mul;
    multiply(int num1,int num2,int num3){
        mul = num1 * num2 * num3;
    }
    void display(){
        cout<<"Multiplication of Three Numbers = "<<mul<<endl;
    }
};
int main() {
    int a,b,c;
    cout<<"Enter Three Numbers:";
    cin>>a>>b>>c;
   multiply m1(a,b,c);
   m1.display();
}