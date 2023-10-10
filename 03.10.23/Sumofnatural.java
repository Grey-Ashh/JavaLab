import java.util.*;

class Sumofnatural
{	
	public static void main(String args[])
		{
			int num;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the number: ");
			num=input.nextInt();
			int sum=0;
			for(int i=1;i<=num;i++)
				sum+=i;
			System.out.println("Sum of the number= "+sum);
		}
}
