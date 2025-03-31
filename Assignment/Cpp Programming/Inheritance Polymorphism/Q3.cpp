// Create a class person having members name and age. Derive a class student having  member  percentage.  Derive  another  class  teacher  having  member salary. Write necessary member function to initialize, read and write data. Write also Main function (Multiple Inheritance)

#include <iostream>
using namespace std;
class Person{
    protected:
        string name;
        int age;
    
    public:
        Person(){
            cout<<"Enter Name: ";
            cin>>name;
            cout<<"Enter Age: ";
            cin>>age;
        }
};
class Student : protected Person{
    public:
        float percentage;
        int total_marks;
        int total_of_subjects;
    
    void s_marks(){
        cout<<"Enter Your Total Marks: ";
        cin>>total_marks;
        cout<<"Enter All Subjects Total Marks :";
        cin>>total_of_subjects;
    }
    void calculate_percentage(){
        percentage = ((float)total_marks/total_of_subjects)*100;
    } 
    void display(){
        calculate_percentage();
        cout<<"Student Name: "<<name<<endl;
        cout<<"Student Age :"<<age<<endl;
        cout<<"Your Total Marks: "<<total_marks<<endl;
        cout<<"Your Percentage : "<<percentage<<endl;
    }
};
class Teacher : protected Person{
    public:
        float salary;
    
    void t_salary(){
        cout<<"Enter Your Salary :";
        cin>>salary;
    }
    void display(){
        cout<<"Teacher Name: "<<name<<endl;
        cout<<"Teacher Age: "<<age<<endl;
        cout<<"Salary : "<<salary<<endl;
    }
};
int main(){
            cout<<"Enter Student Detail"<<endl;
            Student s1;
            s1.s_marks();
            cout<<endl;
            cout<<"Enter Teacher Detail "<<endl;
            Teacher t1;
            t1.t_salary();
            cout<<"\nStudent Detail:"<<endl;
            s1.display();
            cout<<"\nTeacher Detail "<<endl;
            t1.display();
}