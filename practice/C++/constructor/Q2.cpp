//wap in c++ to read and display employee details using nested class

#include <iostream>
using namespace std;
class employee{
    public :
    string emp_name;
    int emp_id;
    int contact;
    void getinfo(){
                cout<<"enter employee name:";
                getline(cin,emp_name);
                cout<<"enter employee id:";
                cin>>emp_id;
                cout<<"Enter Contact :";
                cin>>contact;
    }
    void display(){
        cout<<"Name : "<<emp_name<<endl<<"Emp Id :"<<emp_id<<endl<<"contact :"<<contact<<endl;
    }
        class department{
            string dept_name;
            int dept_id;
            public:
            void getinfo(){
                cout<<"enter department name:";
                cin.ignore();
                getline(cin,dept_name);
                cout<<"enter department id:";
                cin>>dept_id;
            }
            void display(){
                cout<<"Department Name :"<<dept_name<<endl<<"Department id: "<<dept_id<<endl;
            }
        };
};
int main(){
    employee e;
    employee :: department ab;
    e.getinfo();
    ab.getinfo();
    e.display();
    ab.display();
}