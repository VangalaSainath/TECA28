class Staticoverload
{
	public static void sum(String a,String b)
		String c= a+b;
	System.out.println("C");
}
{
	public static void sum(int d,int e)
		int f= d+e;
	System.out.println("e");
}
{
	public static void sum(double s,double t)
	double r= s+t;
	System.out.println("C");
}
public static void main (String [] args)
{
	System.out.println("Main starts");
	sum("Run","Work");
	sum(7,24);
	sum(10.5,2.0);
	System.out.println("Main ends");
}
}