// Write a C++ program to implement a class called Employee that has private member variables for name, employee ID, and salary. Include member functions to calculate and set salary based on employee performance. Using of constructor
#include <iostream>
using namespace std;
class Employee{
    private:
        string name;
        int emp_id;
        float salary;
        float perfomance;
    public:
        void perfomance_based_salary(){
            if(perfomance<2){
                cout<<"No salary increase due to poor performance."<<endl;
            }
            else if(perfomance>2 && perfomance<=3){
                cout<<"5% salary increase for average performance"<<endl;;
                float increment = (salary*0.05);
                salary += increment;
            }
            else if(perfomance>3 && perfomance <=4){
                cout<<"10% salary increase for good performance"<<endl;
                float increment = (salary*0.10);
                salary += increment;
            }
            else if(perfomance > 4 && perfomance <= 5){
                cout<<"20% salary increase for good performance"<<endl;
                float increment = (salary*0.20);
                salary += increment;
            }
            else{
                cout<<"Enter Valid Perfomance"<<endl;
            }
        }
        Employee(){
            cout<<"Enter Employee Name: ";
            cin>>name;
            cout<<"Enter Employee Id: ";
            cin>>emp_id;
            cout<<"Enter Employee Salary: ";
            cin>>salary;
            cout<<"Enter Employee Perfomence(1-5): ";
            cin>>perfomance;
        }
        void display(){
            cout<<"\n-------Employee Details---------"<<endl;
            cout<<"Employee Name :"<<name<<endl;
            cout<<"Employee Id: "<<emp_id<<endl;
            cout<<"Employee Current Salary :"<<salary<<endl;
            cout<<"Employee Perfomance :"<<perfomance<<endl;
            perfomance_based_salary();
            cout<<"Employee Updated Salary : "<<salary<<endl;
        }
};
int main(){
    Employee emp;
    emp.display();
}