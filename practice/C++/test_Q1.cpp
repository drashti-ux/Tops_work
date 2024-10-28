//create base class person and derive class student and teacher demostrating polymorphism
#include <iostream>
#include<string.h>
using namespace std;
class person{
    public:
    string name;
    int age;
    string address;
    
    void get_info(){
        cout<<"Enter Your Name:";
        cin>>name;
        cout<<"Enter age:";
        cin>>age;
        cout<<"Enter Your Address:";
        cin>>address;
    }
    void display(){
        cout<<"Name :"<<name<<endl;
        cout<<"Age:"<<age<<endl;
        cout<<"Address:"<<address<<endl;
    }
    
};
class student:public person{
    public:
    string class_name;
        void get_info(){
            cout<<"Enter Student Name:";
            cin>>name;
            cout<<"Enter Student age:";
            cin>>age;
            cout<<"Enter Student Address:";
            cin>>address;
            cout<<"Enter Student Class Name:";
            cin>>class_name;
        }
        void display(){
            cout<<"Student Name:"<<name<<endl;
            cout<<"Student Age:"<<age<<endl;
            cout<<"Student Address:"<<address<<endl;
            cout<<"Student Class:"<<class_name<<endl;
        }
};
class teacher:public person{
    public :
    float salary;
    void get_info(){
            cout<<"Enter Teacher Name:";
            cin>>name;
            cout<<"Enter Teacher age:";
            cin>>age;
            cout<<"Enter Teacher Address:";
            cin.ignore();
            getline(cin,address);
            cout<<"Enter Teacher Salary:";
            cin>>salary;
        }
        void display(){
            cout<<"Teacher Name:"<<name<<endl;
            cout<<"Teacher Age:"<<age<<endl;
            cout<<"Teacher Address:"<<address<<endl;
            cout<<"Teacher Class:"<<salary<<endl;
        }
};
int main(){
    int role;
    cout<<"What Is Your Role\n1.student\n2.Teacher\n:";
    cin>>role;
    if(role == 1){
        student s1;
        s1.get_info();
        s1.display();
    }
    else if(role == 2){
        teacher t1;
        t1.get_info();
        t1.display();
    }
    else{
        cout<<"Enter Valid choice!!..";
    }
}