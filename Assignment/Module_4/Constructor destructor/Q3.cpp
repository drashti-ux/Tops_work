// Write a C++ program to create a class called Car that has private member variables for company, model, and year. Implement member functions to get and set these variables. 

#include <iostream>
using namespace std;
class Car{
    private:
        string company;
        string  model;
        int year;
    public:
    void set_data(string com,string mod,int yr){
        company = com;
        model = mod;
        year = yr;
    }
    void get_data(){
        cout<<"company name : "<<company<<endl<<"model : "<<model<<endl<<"year :"<<year<<endl;
    }
};
int main(){
    string comp,modl;
    int y;
        cout<<"Enter Company of Car : ";
        cin>>comp;
        cout<<"Enter Model of Car :";
        cin>>modl;
        cout<<"Enter Year: ";
        cin>>y;
    Car c1;
    c1.set_data(comp,modl,y);
    c1.get_data();
}