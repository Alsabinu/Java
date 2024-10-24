package javalab;
import java.util.Scanner;
interface Human{
	final int jobid=1050;
	void learn(String str);
	void work();
}
interface Recruitment{
	void screening(int score);
}
class Programmer implements Human,Recruitment{
	public void learn (String str)
{
	System.out.println("My trained area:"+str);
}
	public void screening(int score)
	{
		System.out.println("Test score:"+score);	
	}
	public void work()
	{
		System.out.println("Selected to the role development:");	
	}
}
public class Interface{
	public static void main(String[] args) {
	Programmer trainee=new Programmer();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your trained area:");
	String str=sc.nextLine();
	System.out.println("Enter your test score:");
	int score=sc.nextInt();
	System.out.println("about my placement:");
	trainee.learn(str);
	trainee.screening(score);
	trainee.work();
	System.out.println("my jobsid is:"+trainee.jobid);
}
}
