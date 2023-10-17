import java.util.*;


class program3
{
	void frequency(String s1)
		{	
			Scanner input=new Scanner(System.in);	
			int i,j,l,flag=0;
			char ch;
			l=s1.length();
			System.out.print("Enter the character to be searched: ");
			ch=input.next().charAt(0);
			for(i=0;i<l;i++)
				{
					if(ch==s1.charAt(i))
						{flag++;}
				}
			if(flag==0)
				System.out.println("Entered the character not present.");
			else
				System.out.println("Entered the character frequency="+flag);
		}
	void rev(String s1)
		{
			int i,j,l;
			String s2="";
			l=s1.length();
			for(i=l-1;i>=0;i--)
				{
					s2+=s1.charAt(i);
				}
			System.out.println("Reverse :"+s2);
		}
	public static void main(String args[])
	{
		int num;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1=input.next();
		program3 x=new program3();
		x.frequency(s1);
		x.rev(s1);
	}
}
