// Write a C++ program to implement a class called Circle that has private member variables for radius. Include member functions to calculate the circle's area and circumference.

#include <iostream>
#define pi 3.14
using namespace std;
class Circle{
    private:
    int radius;
    public:
    void get_redius(){
        cout<<"Enter Radius of Circle:";
        cin>>radius;
    }
    float c_area(){
        float area = pi*radius*radius;
        return area;
    }
    float c_circumference(){
        float circum = 2*pi*radius;
        return circum;
    }
    
};
int main(){
    Circle c1;
    c1.get_redius();
    int ch;
    cout<<"1.Area of Circle"<<endl<<"2.Circumference Of Circle"<<endl;
    cout<<"Enter What You Want To Find :"<<endl;
    cin>>ch;
    switch (ch)
    {
    case 1:
        cout<<"Area Of Circle : "<<c1.c_area();
        break;
    case 2:
        cout<<"Circumference Of Circle : "<<c1.c_circumference();
        break;
    default:
        cout<<"Invalid Choice";
        break;
    }
} 