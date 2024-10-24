package javalab;
import java.util.Scanner;
class Worker{
	double salary,DA,HRA,salary1;
	Worker(double salary,double DA,double HRA)
	{
		this.salary=salary;
		this.DA=DA;
		this.HRA=HRA;
	}
	void display()
	{
		System.out.println("Employee...");
	}
	void calcsalary(){
		salary1=salary*salary*(DA/100)+salary*(HRA/100);
		System.out.println("gross salary="+salary1);
	}
}
class Engineer extends Worker
{
	Engineer(double salary,double DA,double HRA)
	{
		super(salary,DA,HRA);
	}
	void display() 
	{
		super.display();
		super.calcsalary();
		System.out.println("Engineer...");
	}
	void calcsalary() {
		System.out.println("gross salary of engineer="+salary1*2);
	}
}
public class OverRiding{
	public static void main(String args[])
	{
		double salary,DA,HRA;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary of employee:");
		salary=sc.nextDouble();
		System.out.println("Enter DA% of employee:");
		DA=sc.nextDouble();
		System.out.println("Enter HRA% of employee");	
		HRA=sc.nextDouble();
		Engineer e=new Engineer(salary,DA,HRA);
		e.display();
		e.calcsalary();
		sc.close();
	}
}
