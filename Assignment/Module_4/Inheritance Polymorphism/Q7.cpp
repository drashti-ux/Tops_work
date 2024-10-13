// Write  a  C++  Program  to  illustrates  the  use  of  Constructors  in  multilevel inheritance

#include <iostream>
using namespace std;
class grandfather{
    public:
    string g_name;
    grandfather(){
        cout<<"Enter Grand Father Name:";
        cin>>g_name;
    }
};
class father :public grandfather{
    public:
    string f_name;
    father(){
        cout<<"Enter Father Name:";
        cin.ignore();
        getline(cin,f_name);
    }
};
class Child : public father{
    public:
    string c_name;
    Child(){
        cout<<"Enter Child Name:";
        cin>>c_name;
    }
};
int main(){
    Child C1;
    cout<<"\n\t ------------Family Info----------"<<endl;
    cout<<"GrandFather Name:"<<C1.g_name<<endl;
    cout<<"Father Name :"<<C1.f_name<<endl;
    cout<<"Child Name:"<<C1.c_name<<endl;
}