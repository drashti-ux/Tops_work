// Write a C++ Program to find Area of Rectangle using inheritance

#include <iostream>
using namespace std;
class Shape{
    public:
        string shape;
        float area;
    
    Shape(){
        cout<<"Enter Shape Name:";
        cin>>shape;
    }
};
class Rectangle: public Shape{
    public:
        int length;
        int width;
    
    Rectangle(){
        cout<<"Enter Length : ";
        cin>>length;
        cout<<"Enter Width : ";
        cin>>width;
    }
    void Area(){
        area = length * width;
        cout<<"Area Of Rectangle :"<<area;
    }
};
int main(){
    Rectangle rect;
    rect.Area();
}