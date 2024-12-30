//Constructor Overloading
//Write a Java program to create a class called "Book" with instance variables title, author, and price. 
//Implement a default constructor and two parameterized constructors:
//One constructor takes title and author as parameters.
//The other constructor takes title, author, and price as parameters.
//Print the values of the variables for each constructor.
package Constructor;

public class Book {
	String title,author;
	double price;
	Book(String Title,String Author){
		title = Title;
		author = Author;
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
	}
	Book(String Title,String Author,double Price){
		title = Title;
		author = Author;
		price = Price;
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
	}
	public static void main(String [] args) {
		Book b1 = new Book("Story book","Drasti");
		Book b2 = new Book("Xyz","abc",526.01);
	}
}
