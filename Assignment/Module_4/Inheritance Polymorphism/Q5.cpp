// Assume that the test results of a batch of students are stored in three different classes.  Class  Students  are  storing  the  roll  number.  Class  Test  stores  the marks  obtained  in  two  subjects  and  class  result  contains  the  total  marks obtained  in  the  test.  The  class  result  can  inherit  the  details  of  the  marks obtained in the test and roll number of students. (Multilevel Inheritance)

#include <iostream>
using namespace std;
class Student{
    public:
        int roll_no;
        string name;
    
    void Std_info(){
        cout<<"Enter Name:";
        cin>>name;
        cout<<"Enter Roll Number:";
        cin>>roll_no;
    }
};
class Test : public Student{
    public:
        int math_marks;
        int scie_marks;
        int total_of_each;
    
    void get_marks(){
        cout<<"Enter Total Of Each Subject:";
        cin>>total_of_each;
        cout<<"Enter Obtained Marks In Maths:";
        cin>>math_marks;
        cout<<"Enter Obtained Marks In Science:";
        cin>>scie_marks;
    }
};
class Result : public Test{
    public:
    int total_stud;
    int total_sub;
    int percentage;
    void get_info(){
        Std_info();
        get_marks();
        total_stud = math_marks+scie_marks;
        total_sub = 2 * total_of_each;
        percentage = ((float)total_stud/total_sub)*100;

    }
    void display(){
        cout<<"\n--------------Result--------------"<<endl;
        cout<<"Name : "<<name<<endl;
        cout<<"Roll Number : "<<roll_no<<endl;
        cout<<"Maths : "<<math_marks<<" / "<<total_of_each<<endl;
        cout<<"Science : "<<scie_marks<<" / "<<total_of_each<<endl;
        cout<<"Total : "<<total_stud<<" / "<<total_sub<<endl;
        cout<<"Percentage : "<<percentage<<"%"<<endl;
    }
};
int main(){
    Result s1;
    s1.get_info();
    s1.display();
}