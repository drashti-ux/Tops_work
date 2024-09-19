// wap for function with call by Reference

#include <iostream>
using namespace std;
void swap(int *a,int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
    cout<<"number swaped : num 1 = "<<*a<<" num 2 = "<<*b<<endl;
}
int main(){
    int num1,num2;
    cout<<"Enter num 1: ";
    cin>>num1;
    cout<<"Enter num 2: ";
    cin>>num2;
    cout<<"Befor swap : num 1 = "<<num1<<" num 2 = "<<num2<<endl;
    swap(&num1,&num2);
    cout<<"After Swap : num 1 = "<<num1<<" num 2 = "<<num2<<endl;
}
