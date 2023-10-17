import java.util.*;

class areafunction
{
	void area(int v,int l,int b)
		{
			int a;
			a=l*b;
			System.out.println("Area of Rectangle= "+a);
		}
	void area(int r)
		{
			float a;
			a=(float)3.14*r*r;
			System.out.println("Area of Circle= "+a);
		}
	void area(int b,int h)
		{
			float a;
			a=(float)(b*h)/2;
			System.out.println("Area of Triangle= "+a);
		}					
}

class areafigures
{
	public static void main(String args[])
		{	
			Scanner input=new Scanner(System.in);
			System.out.println("Rectangle");
			System.out.print("Enter length :");
			int length=input.nextInt();
			System.out.print("Enter bredth :");
			int bredth=input.nextInt();
			System.out.println("Circle");
			System.out.print("Enter radius :");
			int radius=input.nextInt();
			System.out.println("Triangle");
			System.out.print("Enter height :");
			int height=input.nextInt();
			System.out.print("Enter base length :");
			int base=input.nextInt();
			areafunction x=new areafunction();
			x.area(1,length,bredth);
			x.area(radius);
			x.area(base,height);
		}
}
