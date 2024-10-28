// Write a C++ program to create a class called Triangle that has private member variables for the lengths of its three sides. Implement member functions to determine if the triangle is equilateral, isosceles, or scalene.
#include <iostream>
using namespace std;
class Triangle{
    private:
        int l_side1,l_side2,l_side3;
    public:
        void tringle_type(int s1,int s2,int s3){
            l_side1 = s1;
            l_side2 = s2;
            l_side3 = s3;
            if(l_side1 == l_side2 && l_side2 == l_side3 ){
                cout<<"Triangle is Equilateral"<<endl;
            }
            else if(l_side1 == l_side2 || l_side2 == l_side3 || l_side1 == l_side3){
                cout<<"Triangle is Isosceles"<<endl;
            }
            else{
                cout<<"Triangle is Scalene"<<endl;
            }
        }
};
int main(){
    int side1,side2,side3;
        cout<<"Enter Triangles Three Sides Length :";
        cin>>side1>>side2>>side3;
    Triangle t1;
    t1.tringle_type(side1,side2,side3);

}