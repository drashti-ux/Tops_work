//4. Chaining Constructors
//Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.
package Constructor;

public class Students {
	int student_id;
	String studentName;
	String grade;
	Students(){
		this(102,"harshvi","B+");
		System.out.println("Student Id: "+student_id+" Student name: "+studentName+" Grade: "+grade);
	}
	Students(int id,String name,String grade){
		student_id = id;
		studentName =name;
		this.grade = grade;
	}
	public static void main(String [] args) {
		Students s1 = new Students();
	}
}
