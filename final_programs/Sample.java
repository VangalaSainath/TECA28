class Sample
{
	public final static int a=10;
	public final int b=60;
	public static void main(String [] args)
	{
		final int c=100;
		System.out.println(c);
		System.out.println(a);
		Sample s1=new Sample();
		System.out.println(s1.b);
	}
}
