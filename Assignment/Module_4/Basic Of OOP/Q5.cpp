// Write a C++ program to create a class called Person that has private member variables for name, age and country. Implement member functions to set and get the values of these variables.

#include <iostream>
using namespace std;
class Person{
    private:
    string name;
    int age;
    string country;

    public:
    void setdata(){
        cout<<"Enter Name : ";
        getline(cin,name);
        cout<<"Enter Age :";
        cin>>age;
        cout<<"Enter Country Name:";
        cin.ignore();
        getline(cin,country);
    }
    void display(){
        cout<<"Name of Person: "<<name<<endl;
        cout<<"Age : "<<age<<endl;
        cout<<"Country :"<<country<<endl;
    }
};
int main(){
    Person p1;
    p1.setdata();
    p1.display();
}