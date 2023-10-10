import java.util.*;

class largest3
{	
	public static void main(String args[])
		{
			int a,b,c;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the first number: ");
			a=input.nextInt();
			System.out.print("Enter the second number: ");
			b=input.nextInt();
			System.out.print("Enter the third number: ");
			c=input.nextInt();
			if(a>b && a>c)
				System.out.println("The largest is "+a);
			else if(b>c)
				System.out.println("The largest is "+b);
			else
				System.out.println("The largest is "+c);
		}
}
