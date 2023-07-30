// print Ascii value of a character
import java.util.Scanner;
class Ascii 
{
	public static void main(String[] args) 
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charcter :");
		ch=sc.next().charAt(0);
		int a=ch; //implicit typecasting ch is 2 bytes can store into int 4 byte container which is done by compiler implicitly
		System.out.println("the Ascii value of "+ch+" is "+a);
	}
}
