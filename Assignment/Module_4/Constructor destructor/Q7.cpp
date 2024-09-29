// Write a C++ program to implement a class called Date that has private member variables for day, month, and year. Include member functions to set and get these variables, as well as to validate if the date is valid.

#include <iostream>
using namespace std;
class Date{
    private:
        int day,month,year;
    
    public:
        void set_date(int dd,int mm,int yy){
            day = dd;
            month = mm;
            year = yy;
        } 
        bool is_leap_year(int y){
            if(y%4==0 && y%100 != 0 || y%400 == 0){
                return true;
            }
            else{
                return false;
            }
        }
        int days_in_month(int m){
            if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
                return 31;
            }
            else if(m==4||m==6||m==9||m==11){
                return 30;
            }
            else{
                if(is_leap_year(year)){
                    return 29;
                }
                else{
                    return 28;
                }
            }
        }
        bool validate(int d,int m){
            if(m>=1 && m<=12){
                if(d >= 1 && d <= days_in_month(m)){
                    return true;
            }
            }
            else{
                return false;
                
            }
        }
        void get_date(){
            if (validate(day,month)){
                cout<<"Date : "<<day<<"-"<<month<<"-"<<year<<endl; 
            }
            else{
                cout<<"Invalid Date";
            }
        }
};
int main(){
    int d,m,y;
    cout<<"Enter Date:";
    cin>>d;
    cout<<"Enter Month Number:";
    cin>>m;
    cout<<"Enter Year :";
    cin>>y;
        Date day;
        day.set_date(d,m,y);
        day.get_date();
}