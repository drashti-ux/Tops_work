// wap to check whether the given number is palindrom or not using do..while loop

#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter Number :";
    cin>>num;
    int i = num;
    int rev = 0;
    do{
        int reminder = i%10;
        rev = rev*10 + reminder;
        i = i/10;
    }
    while(i>0);
    if(num==rev){
        cout<<num<<" is palidrom";
    }
    else{
       cout<<num<<" is not palidrom";
    }
}
