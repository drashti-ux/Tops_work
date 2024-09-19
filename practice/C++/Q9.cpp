// wap for 1d array with dynamic value

#include <iostream>
using namespace std;
int main(){
   int num;
   cout<<"Enter The Number of elements you want";
   cin>>num;
   int arr[num];
        cout<<"Enter Elements:";
        for(int i = 0 ;i < num;i++){
            cin>>arr[i];
        }
        cout<<"Array Elements:";
        for(int i = 0 ;i < num;i++){
            cout<<arr[i]<<" ";
        }
}