class Addition
{ 
	public static void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum of  "+ a +   "and"  +b+   "is"  +c);
	}
	public static void sum(double i,double k)
	{
		double  d=i+k;
		System.out.println("Sum of  " + i + "and"    +k+ "is"    +d);
	}
public static void main(String [] args)
	{
	System.out.println("Main starts");
	sum(5.5,6.5);
	sum(10,5);
	System.out.println("Main ends");
	}

}