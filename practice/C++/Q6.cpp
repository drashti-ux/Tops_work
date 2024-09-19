// wap for jump statement

#include <iostream>
using namespace std;
int main(){
    int i;
    cout<<"Exaple of Continue statement"<<endl; 
    for( i = 1;i<=5;i++){
        if(i==3){
            continue;
        }
        cout<<i;
    }
    cout<<endl;
    cout<<"Example of Break Statement"<<endl;
    for(i =1 ;i<=5;i++){
        if(i==4){
            break;
        }
        cout<<i;
    }
    cout<<endl;
    cout<<"Example of Goto statement"<<endl;
    i=1;
    lable:
    cout<<i;
    i++;
    if(i<=5){
        goto lable;
    }
    cout<<endl;
    cout<<"Example of return statement"<<endl;
    for(i=1;i<=5;i++){
        if(i>1){
            return 0;
        }
        cout<<i;
    }
}