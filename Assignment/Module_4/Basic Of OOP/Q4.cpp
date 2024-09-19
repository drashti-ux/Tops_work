// Write a C++ program to create a class called Rectangle that has private member variables for length and width.Implement member functions to calculate the rectangle's area and perimeter.

#include <iostream>
using namespace std;
class Rectangle{
    private:
        int width;
        int length;
        int area,perimeter;
    public:
        void get_data(){
            cout<<"Enter Length Of Rectangle : ";
            cin>>length;
            cout<<"Entet Width Of Rectangle : ";
            cin>>width;
        }
        int r_area(){
            area = length * width;
            return area;
        }
        int r_perimeter(){
            perimeter = 2*(length+width);
            return perimeter;
        }
};
int main(){
    Rectangle r1;
    int ch;
    r1.get_data();
    cout<<"1.Area of Rectangle"<<endl<<"2.perimeter of Rectangle"<<endl;
    cout<<"Enter What You Want To do With Rectangele: ";
    cin>>ch;
    switch (ch)
    {
    case 1:
        cout<<"Area Of Rectangle: "<<r1.r_area();
        break;
    case 2:
        cout<<"Perimeter Of Rectangle: "<<r1.r_perimeter();
        break;
    default:
        cout<<"Invalid Choice!!";
        break;
    }
}