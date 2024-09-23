// c++ program to print fibonaci series using parameterised constructor
#include <iostream>
using namespace std;
class fibonaci{
    int first = 0; 
    int second = 1;
    int next;
    public:
    fibonaci(int terms){
            cout<<first<<" ";
        if(terms > 1){
            cout<<second<<" ";
            for(int i = 3;i<=terms;i++){
                next = first + second;
                cout<<next<<" ";
                first = second;
                second = next;
            }
        }
        
    }
};
int main() {
    int num;
    cout<<"Enter Number Of Terms:";
    cin>>num;
    fibonaci f1(num);
}