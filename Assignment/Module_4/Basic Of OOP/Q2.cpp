// Q2.Define a class to represent a bank account.
// Include the following members:
//     Data Member: 
//         -Name of the depositor 
//         -Account Number 
//         -Type of Account 
//         -Balance amount in the account 
//     Member Functions 
//         -To assign values 
//         -To deposited an amount 
//         -To withdraw an amount after checking balance 
//         -To display name and balance

#include <iostream>
using namespace std;
class BankAccount{
    public:
    string depositor_name;
    int account_number;
    string account_type;
    float balance;

    public:
    void setdata(){
        cout<<"Enter Depositior Name: ";
        getline(cin,depositor_name);
        cout<<"Enter Account Number: ";
        cin>>account_number;
        cout<<"Enter Account Type: ";
        cin.ignore();
        getline(cin,account_type);
        cout<<"Enter Balance : ";
        cin>>balance;
    }
    void deposite(){
        float depo_amount;
        cout<<"Enter The Amount for Deposite : ";
        cin>>depo_amount;
        balance += depo_amount;
    }
    void withdraw(){
        float withdrow_amount;
        cout<<"Enter The Amount for Withdrow : ";
        cin>>withdrow_amount;
        if(balance>=withdrow_amount){
            balance -= withdrow_amount;
        }
    }
    void display(){
        cout<<"Name : "<<depositor_name<<endl;
        cout<<"Available Balance : "<<balance<<endl;
    }
};
int main(){
    BankAccount ba;
    ba.setdata();
    int ch;
    cout<<"1.check balance"<<endl<<"2.Money Deposite"<<endl<<"3.Withdrow Amount"<<endl;
    cout<<"Enter What You Want To Do?: ";
    cin>>ch;
    switch (ch)
    {
    case 1:
        ba.display();
        break;
    case 2: 
        ba.deposite();
        ba.display();
        break;
    case 3:
        ba.withdraw();
        ba.display();
        break;
    default:
        cout<<"Invalid Choice";
        break;
    }
}