// Write a C++ program to implement a class called Bank Account that has private member variables for account number and balance. Include member functions to deposit and withdraw money from the account.

#include <iostream>
using namespace std;
class BankAccount{
    private:
        int account_number;
        float balance ;
    public:
    void deposite(float amount){
        balance += amount;
        cout<<endl<<endl<<"Money Deposited Succesfully!!.";
        cout<<"Total Balance : "<<balance;
    }
    void withdraw(float amount){
        if(balance > amount){
            cout<<endl<<endl<<"Money Withdrawed Succesfully!!."<<endl;
            balance -= amount;
            cout<<"Total Balance : "<<balance;
        }
        else{
            cout<<endl<<endl<<"Insufficient balance"<<endl;
            cout<<"Available Balance : "<<balance;
        } 
    }
    void show(){
        cout<<endl<<endl<<"Account Opened Succesfully!!";
        cout<<"Account Number :"<<account_number<<endl;
        cout<<"Account Balance :"<<balance;
    }
    void set_data(){
        cout<<"Enter Account Number:";
        cin>>account_number;
        cout<<"Enter Balance: ";
        cin>>balance;
    }
};
int main(){
        BankAccount ac1;
        ac1.set_data();
        ac1.show();
        int ch;
        cout<<endl<<endl<<"1.Money Deposite"<<endl<<"2.Money Withdraw"<<endl<<"Which Action You Want To Perform:";
        cin>>ch;
        switch(ch){
            case 1:{
                float amount;
                cout<<"Enter Amount:";
                cin>>amount;
                ac1.deposite(amount);
                break;
            }
            case 2:
            {   
                float amount;
                cout<<"Enter Amount:";
                cin>>amount;
                ac1.withdraw(amount);
                break;
            }
            default :{
                cout<<"Invalid Choice!!..";
            }
        }
}