class Division 
{
	public static int divide(int i,int j)
	{
		int k=i%j;
		return k;
	}
	public double divide(double a,double b)
	{
		double c=a/b;
		return c;
	}

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		int remainder=divide(10,3);
		Division d1=new Division();
			double quotient=d1.divide(15,2.0);
			System.out.println("Remainder");
				System.out.println("Quotient");
				System.out.println("Main ends");

	}
}
