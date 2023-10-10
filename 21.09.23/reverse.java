import java.util.*;

class reverse
{	
	public static void main(String args[])
		{
			int num,rem,rev=0;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the number: ");
			num=input.nextInt();
			while(num>0)
				{
					rem=num%10;
					rev=(rev*10)+rem;
					num=num/10;
				}
			System.out.println("The reverse of the number= "+rev);		
		}
}
