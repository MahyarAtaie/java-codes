package newProject3;

import java.util.Scanner;

public class newProject4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter Your Student Number (1,2 or 3) :");
		int b = a.nextInt();
		
		switch(b) {
		
		case 1 : 
			System.out.println("Welcome Ahmad");
		double[] c = {96,89,90.5,79};
		double[] d = {92,87,91.8,97};
		System.out.println("__________________________");
		System.out.println("Your first Exam scores:");
		System.out.println("Writing : " + c[0]);
		System.out.println("Reading : " + c[1]);
		System.out.println("Speaking : " + c[2]);
		System.out.println("Grammer : " + c[3]);
		System.out.println("__________________________");
		System.out.println("Your second Exam scores:");
		System.out.println("Writing : " + d[0]);
		System.out.println("Reading : " + d[1]);
		System.out.println("Speaking : " + d[2]);
		System.out.println("Grammer : " + d[3]);
		break;
		
		case 2 :
			System.out.println("Welcome Ali");
			double[] f = {79,89,99,92.7};
			double[] h = {97.9,98,100,80};
			System.out.println("__________________________");
			System.out.println("Your first Exam scores:");
			System.out.println("Writing : " + f[0]);
			System.out.println("Reading : " + f[1]);
			System.out.println("Speaking : " + f[2]);
			System.out.println("Grammer : " + f[3]);
			System.out.println("__________________________");
			System.out.println("Your second Exam scores:");
			System.out.println("Writing : " + h[0]);
			System.out.println("Reading : " + h[1]);
			System.out.println("Speaking : " + h[2]);
			System.out.println("Grammer : " + h[3]);
			break;
			
		case 3 : 
			System.out.println("welcome mohammad");
			double[] v = {69,78,90,74.5};
			double[] m = {99, 87,77.8,68};
			System.out.println("__________________________");
			System.out.println("Your first Exam scores:");
			System.out.println("Writing : " + v [0]);
			System.out.println("Reading : " + v[1]);
			System.out.println("Speaking : " + v[2]);
			System.out.println("Grammer : " + v[3]);
			System.out.println("__________________________");
			System.out.println("Your second Exam scores:");
			System.out.println("Writing : " + m[0]);
			System.out.println("Reading : " + m[1]);
			System.out.println("Speaking : " + m[2]);
			System.out.println("Grammer : " + m[3]);
			break;
		
		default  : 
		System.out.println("this Student number doesn't exist ,"
				+ " please choose one of these three : 1 , 2 or 3 .");
		
		
		
		
		
		}
			
			
			
			
			
			
			
			
			
			
			
		
		}
		
		
		
		
		
		
		

	}


