//write a pogram to read and print employee information using multiple inheritance

#include <iostream>
using namespace std;
class employee{
    protected : 
        int emp_id;
        string emp_name;
        float salary;
    public:
        void get_data(){
            cout<<"Enter Employee Id:";
            cin>>emp_id;
            cout<<"Enter Employee Name :";
            cin.ignore();
            getline(cin,emp_name);
            cout<<"Enter Employee Salary:";
            cin>>salary;
        }
        void display_emp(){
            cout<<"Employee Id: "<<emp_id<<endl;
            cout<<"Employee Name: "<<emp_name<<endl;
            cout<<"Employee Salary: "<<salary<<endl;
        }
};
class department{
    protected :
        int dept_id;
        string dept_name;

    public:
        void get_dept(){
            cout<<"Enter Department Id:";
            cin>>dept_id;
            cout<<"Enter Department Name :";
            cin.ignore();
           getline(cin,dept_name);
        }
        void display_dept(){
            cout<<"Department Id: "<<dept_id<<endl;
            cout<<"Department Name: "<<dept_name<<endl;
        }
};

class info : protected employee,department{
        public:
            string office_name;
        
        void get_info(){
            cout<<"Enter Office Name:";
            cin>>office_name;
            get_dept();
            get_data();
        }
        void show_info(){
            cout<<"\n\n\nOffice Name : "<<office_name<<endl;
            display_dept();
            display_emp();
        }
};
int main(){
        info emp1;
        emp1.get_info();
        emp1.show_info();
}