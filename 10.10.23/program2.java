import java.util.*;


class program2
{
	int factorial(int n)
		{	int facto=1;
			for(int i=n;i>0;i--)
				facto=facto*i;
			return facto;
		}
	int sum(int num)
		{
			int sumdigit=0,rem;
			while(num>0)
				{
					rem=num%10;
					sumdigit+=rem;
					num=num/10;
				}
			return sumdigit;
		}
	public static void main(String args[])
	{
		int num;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=input.nextInt();
		program2 x=new program2();
		System.out.println("Factorial of the number: "+x.factorial(num));
		System.out.println("Sum of digits of the number: "+x.sum(num));
	}
}
