package javalab;
import java.util.Scanner;
public class Methodoverloadin {
	void area(float base1,float height1) {
		System.out.println("Area of triangle is "+0.5*base1*height1);
	}
	void area(int length2,int breadth2) {
		System.out.println("Area of rectangle is "+length2*breadth2);
	}
	void area(float radius) {
		System.out.println("Area of circle is "+3.14*radius*radius);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of the triangle:");
		float base1=sc.nextFloat();
		System.out.println("Enter the height of the triangle:");
		float height1=sc.nextFloat();
		System.out.println("Enter the length of the rectangle:");
		int length2=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle:");
		int breadth2=sc.nextInt();
		System.out.println("Enter the radius of the circle:");
		float radius=sc.nextFloat();
		Methodoverloadin m=new Methodoverloadin();
		m.area(base1, height1);
		m.area(length2,breadth2);
		m.area(radius);
		sc.close();
	}
}
