import java.util.Scanner;
public class ExceptionHandling {
public static void main(String args[]) {
Scanner scanner=new Scanner(System.in);
System.out.println("Choose an operation");
System.out.println("1.Arithmatic Operaton");
System.out.println("2.Array Access");
int choice=scanner.nextInt();
char c='n';
do {
switch (choice) {
case 1:
	try {
		System.out.println("Enter the numerator:");
		int numerator=scanner.nextInt();
		System.out.println("Enter the denominator");
		int denominator=scanner.nextInt();
		int result=numerator/denominator;
		System.out.println("Result:"+result);}
	catch (ArithmeticException e) {
		System.out.println("Caught an Exception:"+e.getMessage());
}
break;
case 2:
	int[] numbers= {1,2,3};
	try {
		System.out.println("Enter array index to access:");
		int index=scanner.nextInt();
		System.out.println("Element at index" + index +": "+numbers[index]);}
	catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Caught an Exception:"+e.getMessage());
}
	break;
	default:
		System.out.println("Invalid choice.Please select 1 or 2.");
		break;
}
System.out.println("Do you want to continue? Y/N");
c=scanner.next().charAt(0);}
while (c=='y');
scanner.close();
}
}
	












