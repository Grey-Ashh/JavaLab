import java.util.*;

class swap
{	
	public static void main(String args[])
		{
			int a,b,temp;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the first number: ");
			a=input.nextInt();
			System.out.print("Enter the second number: ");
			b=input.nextInt();
			System.out.println("Before swap a= "+a+" b= "+b);
			temp=a;
			a=b;
			b=temp;
			System.out.println("After swap a= "+a+" b= "+b);
		}
}
