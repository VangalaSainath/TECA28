 class Multiplication
{ 
	public static void Mul(int a,double b)
	{
		double c=a*b;
		System.out.println("{" + a +   "X"  +b+   "="  +c "}");
	}
	public static void Mul(double i,int k)
	{
		double  d=i*k;
		System.out.println( "{" + i + "X"    +k+ "="    +d "}");
	}
	public static void Mul(int x,int y,double z)
	{
		double w=x*y*z;
		System.out.println("{" + x + "X"    +y+ "="    +z "}");
	}
public static void main(String [] args)
	{
	System.out.println("Main starts");
	Mul(5,6.5);
	Mul(10,5,2.5);
	Mul(3.5,2);
	System.out.println("Main ends");
	}

} 

