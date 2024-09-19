// wap to print fibonaci series

#include <iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter The length of Series : ";
    cin>>num;
    int first =0 , seocnd=1 ,next;

    cout<<first<<" ";
    if(num>1){
        cout<<seocnd<<" ";
        for(int i = 3;i<=num;i++){
            next = first + seocnd;
            cout<<next<<" ";
            first = seocnd;
            seocnd = next;
        }
    }
}