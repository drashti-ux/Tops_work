// Write a C++ Program display Student Mark sheet using Multiple inheritance

#include <iostream>
using namespace std;
class Maths{
    public:
    int maths;
    int get_maths(){
        cout<<"Enter Obtained Marks In Maths:";
        cin>>maths;
    }
};
class Science{
    public:
    int science;
    int get_science(){
        cout<<"Enter Obtained Marks In Science:";
        cin>>science;
    }
};
class English{
    public:
    int eng;
    int get_english(){
        cout<<"Enter Obtained Marks In English:";
        cin>>eng;
    }
};
class Student : public Maths,Science,English{
    public:
    string name;
        int total_of_sub;
        int total_of_std;
        int e_total;

    void details(){
        cout<<"Enter Name:";
        cin>>name;
        cout<<"Enter Total Marks Of Each Subject:";
        cin>>e_total;
        get_maths();
        get_english();
        get_science();
    }
    void marks_sheet(){
        int total_of_sub = 3*e_total;
        int total_of_std = maths+science+eng;
        if(maths>e_total || eng >e_total || science>e_total){
            cout<<"Invalid Marks! Marks Must Be in Betwween 0 to "<<e_total<<endl;
        }
        else{
            cout<<"\n-------- Student Marks Sheet --------"<<endl;
            cout<<"Name: "<<name<<endl;
            cout<<"Maths: "<<maths<<" / "<<e_total<<endl;
            cout<<"English: "<<eng<<" / "<<e_total<<endl;
            cout<<"Science: "<<science<<" / "<<e_total<<endl;
            cout<<"Total: "<<total_of_std<<" / "<<total_of_sub<<endl;
            cout<<"Percentage: "<<((float)total_of_std/total_of_sub)*100<<" %"<<endl;
        }
    }
    
};
int main(){
    Student s1;
    s1.details();
    s1.marks_sheet();
}
