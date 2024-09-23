// wap in c++ constructor and ddestructor to get and display odd numbers.

#include <iostream>
using namespace std;
class oddnum{
    public:
    oddnum(int start,int end){
        for(int i =start;i<=end;i++){
            if(i%2 != 0){
                cout<<i<<" ";
            }
        }
        cout<<endl;
    }
    ~oddnum(){
        cout<<"destructor is running..";
    }
};
int main(){
    oddnum num(1,50);
}