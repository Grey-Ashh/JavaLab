import java.util.*;

class multiply
{	
	public static void main(String args[])
		{
			int a,b;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the first number: ");
			a=input.nextInt();
			System.out.print("Enter the second number: ");
			b=input.nextInt();
			System.out.println("The product of "+a+" and "+b+ " is "+(a*b));
		}
}
