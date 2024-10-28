// Assume a class cricketer is declared. Declare a derived class batsman from cricketer.  Data  member  of  batsman.  Total  runs,  Average  runs  and  best performance. Member functions input data, calculate average runs, Display data. (Single Inheritance)

#include<iostream>
using namespace std;
class Cricketer{
    protected:
        string name;
        int total_match;

    public:
       void Cricketer_info(){
            cout<<"Enter Cricketer Name : ";
            cin>>name;
            cout<<"Enter Total Matches Played :";
            cin>>total_match;
       }
       void show_info(){
            cout<<"Cricketer Name : "<<name<<endl;
            cout<<"Total Matchs: "<<total_match<<endl;
       }
};
class Batsman : protected Cricketer{
    public:
        int total_runs;
        float average_runs;
        int best_perfomance;
    void Average(int total,int matches){
        if(total > 0){
            average_runs = (float) total/matches;
        }
        else{
            average_runs = 0.0;
        }
    }
    void info(){
        Cricketer_info();
        cout<<"Enter Total Runs: ";
        cin>>total_runs;
        cout<<"Enter Best Perfomance(Highest  Runs) : ";
        cin>>best_perfomance;
    }
    void show(){
        Average(total_runs,total_match);
        show_info();
        cout<<"Total Runs: "<<total_runs<<endl;
        cout<<"Average Runs: "<<average_runs<<endl;
        cout<<"Best Perfomence: "<<best_perfomance<<endl;
    }
};
int main(){
    Batsman cb;
    cb.info();
    cb.show();
}