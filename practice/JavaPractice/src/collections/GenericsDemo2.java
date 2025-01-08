package collections;

import java.util.ArrayList;

public class GenericsDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		 
		Student s1 = new Student();
		s1.setCity("Valsad");
		s1.setRoll_no(33);
		s1.setName("Drashti");
		s1.setDegree("BE");
		
		Student s2 = new Student();
		s2.setCity("Valsad");
		s2.setRoll_no(33);
		s2.setName("Drashti");
		s2.setDegree("BE");
		
		s.add(s1);
		s.add(s2);
		
		for(Student stud: s) {
			
			System.out.println("Student rollno: "+stud.getRoll_no());
			System.out.println("Student rollno: "+stud.getName());
			System.out.println("Student rollno: "+stud.getCity());
			System.out.println("Student rollno: "+stud.getDegree());
		}
	}
}
