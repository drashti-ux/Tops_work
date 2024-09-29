//wap to having two class name fruit with data mamber to calculate number of fruits in basket.create 2 other classes apple and mango to calculate number of apples and mangos in basket . print the n number of fruits of each type and totle number of fruits in a basket.

#include <iostream>
using namespace std;
class mango{
    public :
    int n_mangos;
    
    int get_mango(){
        cout<<"Enter Number of Mangos in basket:";
        cin>>n_mangos;
        return n_mangos;
    }
    void show_mango(){
        cout<<"Mangos :"<<n_mangos<<endl;
    }
};
class apples{
    public :
    int n_apples;
    
    int get_apples(){
        cout<<"Enter Number of Apples in basket:";
        cin>>n_apples;
        return n_apples;
    }
    void show_apples(){
        cout<<"Apples :"<<n_apples<<endl;
    }
};
class fruits : public mango,apples{
    public :
    int total_fruits;

    void get_fruits(){
        get_mango();
        get_apples();
        total_fruits = n_apples + n_mangos;
    }
    void display_fruits(){
        show_mango();
        show_apples();
        cout<<"Total :"<<total_fruits;
    }
};
int main(){
    fruits fts;
    fts.get_fruits();
    fts.display_fruits();
}