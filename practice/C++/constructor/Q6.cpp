// wap to create markssheat of 5 students using constructor
#include <iostream>
using namespace std;
class markssheat{
    public:
    int marks;
    string name;
    int roll_no;
    markssheat(){
        cout<<"Enter Roll Number: ";
        cin>>roll_no;
        cout<<"Enter Student Name:";
        cin.ignore();
        getline(cin,name);
        cout<<"Enter Marks :";
        cin>>marks;
    }
    void display(){
        cout<<"Student Name:"<<name<<endl<<"Roll Number:"<<roll_no<<endl<<"Marks :"<<marks<<endl;
    }
}; 
int main(){
        markssheat s1;
        s1.display();
        markssheat s2;
        s2.display();
        markssheat s3;
        s3.display();
        markssheat s4;
        s4.display();
        markssheat s5;
        s5.display();
}