import java.util.*;

class largest2
{	
	public static void main(String args[])
		{
			int a,b;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the first number: ");
			a=input.nextInt();
			System.out.print("Enter the second number: ");
			b=input.nextInt();
			if(a>b)
				System.out.println("The largest of "+a+" and "+b+ " is "+a);
			else
				System.out.println("The largest of "+a+" and "+b+ " is "+b);
		}
}
