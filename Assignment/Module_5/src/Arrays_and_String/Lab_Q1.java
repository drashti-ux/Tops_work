//Write a program to perform matrix addition and subtraction using 2D arrays.

package Arrays_and_String;

import java.util.Scanner;

public class Lab_Q1 {
	Scanner sc = new Scanner(System.in);
	int rows,cols;
	int [][] A;
	int [][] B ;
	int [][] Add;
	int [][] Sub;
	Lab_Q1(){
		System.out.println("Enter the Number of Rows in Matrix:");
		rows = sc.nextInt();
		System.out.println("Enter the Number of Cols in Matrix:");
		cols = sc.nextInt();
			A = new int[rows][cols];
			B= new int[rows][cols];
			Add = new int[rows][cols];
			Sub = new int[rows][cols];
	}
	
	//for get values in matrix A and B
	public void getValues() {
		System.out.println("Enter Values Of Matrix A :");
		for(int i =0;i<A.length;i++) {
			for(int j =0;j<A[i].length;j++) {
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Values Of Matrix B :");
		for(int i =0;i<B.length;i++) {
			for(int j =0;j<B[i].length;j++) {
				B[i][j] = sc.nextInt();
			}
		}
	}
	
	//For Perform Addition
	public void DoAddition() {
		for(int i =0;i<A.length;i++) {
			for(int j =0 ;j<A[i].length;j++) {
				Add[i][j] = A[i][j] + B[i][j];
			}
		}
	}
	
	//for display addition of two matrix
	public void getAddition() {
		DoAddition();  //addition
		System.out.println("Addition of Matrix A and Matrix B:");
		for(int i =0;i<Add.length;i++) {
			for(int j =0;j<Add[i].length;j++) {
				System.out.print(Add[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//for Perform Subtraction
	public void DoSubstraction() {
		for(int i =0;i<A.length;i++) {
			for(int j =0 ;j<A[i].length;j++) {
				Sub[i][j] = A[i][j] - B[i][j];
			}
		}
		
	}
	
	//for Display subtraction
	public void GetSubstraction() {
		DoSubstraction();   //subtraction
		System.out.println("Substraction of Matrix A and Matrix B:");
		for(int i =0;i<Sub.length;i++) {
			for(int j =0;j<Sub[i].length;j++) {
				System.out.print(Sub[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//display matrix A and B
	public void display() {
		System.out.println("Matrix A:");
		for(int i =0;i<A.length;i++) {
			for(int j =0;j<A[i].length;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix B:");
		for(int i =0;i<B.length;i++) {
			for(int j =0;j<B[i].length;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args) {
		Lab_Q1 obj = new Lab_Q1();
		obj.getValues();
		obj.display();
		obj.getAddition();
		obj.GetSubstraction();
	}
}

