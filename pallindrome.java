package javalab;
import java.util.Scanner;
class pallindrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check the given word is pallindrome or not:");
		String str=sc.nextLine();
		int flag=0;
		int len=str.length();
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("The given word is a pallindrome");
		}
		else
		{
			System.out.println("The given word is not a pallindrome");
		}
	}
}
