// Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
// An Invoice should include four pieces of information as instance variables‐a part number(type String),a part
// description(type String),a quantity of the item being purchased (type int) and a price per item  (double). Your
// class should have a constructor that initializes the four instance variables. Provide a set and a get method for
// each instance variable. In addition, provide a method named getInvoice Amount that calculates the invoice
// amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the
// quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a
// test application named InvoiceTest that demonstrates class Invoice’s capabilities.


#include <iostream>
#include <string.h>
using namespace std;
class invoice{
    private:
    string number;
    string description;
    int quantity;
    double price_per_item;
    public:
    invoice(string number,string description,int quantity,double price_per_item){
            this->number = number;
            this->description = description;
            this->quantity = quantity;
            this->price_per_item = price_per_item;
        }
    void get_invoice(){
        cout<<"Invoice Number:"<<number<<endl;
        cout<<"Description:"<<description<<endl;
        cout<<"Quantity:"<<quantity<<endl;
        cout<<"Price of Product:"<<price_per_item<<endl;
    }
    void get_invoice_amount(){
        double amount;
        if(quantity < 0 || price_per_item < 0){
            amount = 0 ;
        }
        else{
             amount = quantity*price_per_item;
        }
        cout<<"Invoice Amount :"<<amount<<endl;
        
    }    
};
int main() {
    string in_num;
    string des;
    int qnty;
    double prise;
        cout<<"Enter Invoice Number:";
        cin>>in_num;
        cout<<"Enter Description:";
        cin.ignore();
        getline(cin,des);
        cout<<"Enter Quantity:";
        cin>>qnty;
        cout<<"Enter Price Of Item:";
        cin>>prise;
    invoice i1(in_num,des,qnty,prise);
    i1.get_invoice();
    i1.get_invoice_amount();
        
}