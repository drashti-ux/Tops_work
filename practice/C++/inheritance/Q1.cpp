// wap for single inheritance class "vehicle" and derived class "car".
// the base class have data members : color,max_speed.
//the derived class have data member number of doors.
#include <iostream>
using namespace std;
class vehicle{
    private:
    string color;
    int speed;
    public:
    void get_data(){
        cout<<"Enter the color:";
        getline(cin,color);
        cout<<"Enter Speed:";
        cin>>speed;
    }
    void display(){
        cout<<"Color : "<<color<<endl<<"Speed : "<<speed<<endl;
    }
};
class car : public vehicle{
    private:
    int doors;
    public:
    void get_info(){
        get_data();
        cout<<"Enter the Number of doors:";
        cin>>doors;
    }
    void show(){
        display();
        cout<<"Doors : "<<doors<<endl;
    }
};
int main() {
   car c;
   c.get_info();
   c.show();
}