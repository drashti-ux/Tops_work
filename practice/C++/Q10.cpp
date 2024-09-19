// wap for 2d array with dynamic value

#include <iostream>
using namespace std;
int main(){
    int row,col;
    cout<<"Enter Number of rows:";
    cin>>row;
    cout<<"Enter Number of cols:";
    cin>>col;
    int arr[row][col];
    cout<<"Enter Elements: "<<endl;
    for(int i = 0;i<row;i++){
        for(int j = 0;j<col;j++){
            cin>>arr[i][j];
        }
    }
    cout<<"Array Elements:"<<endl;
    for(int i = 0;i<row;i++){
        for(int j = 0;j<col;j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
}