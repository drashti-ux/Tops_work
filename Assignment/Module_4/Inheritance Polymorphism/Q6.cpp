// Write a C++ Program to show access to Private Public and Protected using Inheritance.

#include <iostream>
using namespace std;
class Data{
    public:
        int pub_var;
    private:
        int priv_var;
    protected:
        int pro_var;
    
    public:
    void set_data(){
        cout<<"Enter value of public variable:";
        cin>>pub_var;
        cout<<"Enter Value of Private Variable:";
        cin>>priv_var;
        cout<<"Enter value of protected variable:";
        cin>>pro_var;
    }
};
class Show : public Data{
    public:
     show_data(){
        cout<<"Public Variable:"<<pub_var<<endl;
        cout<<"Private Variable is Not Accessed."<<endl;
        cout<<"Protected Variable:"<<pro_var<<endl;
    }
};
int main(){
    Show s1;
    s1.set_data();
    s1.show_data();
}

