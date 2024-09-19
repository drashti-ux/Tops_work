// w a menu driven program to find area of circle,rectangle,triangle
#include <iostream>
#include <cmath>
using namespace std;
int main(){
    int ch;
    cout<<"1.Circle"<<endl<<"2.Rectangle"<<endl<<"3.Triangle"<<endl;
    cout<<"Enter Your Choice Of which You want To find Area:";
    cin>>ch;
    switch(ch){
        case 1:{
            int redious;
            float PI = 3.14;
            cout<<"For Circle Area Enter Redious of circle:";
            cin>>redious;
            float area = PI*pow(redious,2);
            cout<<"Area Of Circle = "<<area;
            break;
        }
        case 2:{
            int length,width;
            cout<<"For Rectangle Area Enter Length od Rectangle:";
            cin>>length;
            cout<<"For Rectangle Area Enter width od Rectangle:";
            cin>>width;
            int area = length*width;
            cout<<"Area Of Rectangle = "<<area;
            break;
        }
        case 3:{
            int base,height;
            float half = 0.5;
            cout<<"For Triangle Area Enter Base of Triangle:";
            cin>>base;
            cout<<"For Triangle Area Enter Height of Triangle:";
            cin>>height;
            float area = half*base*height;
            cout<<"Area Of Triangle = "<<area;
            break;
        }
        default:{
            cout<<"Enter Valid Choice.";
        }
    }
}