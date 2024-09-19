// write a programm to calculate a factorial using loop

#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter Number Of Which You Want To Find Factorial:";
    cin>>num;
    int fact = 1;
    for(int i = 1;i<=num;i++){
        fact *=  i;
    }
    cout<<num<<" factorial = "<<fact;
}