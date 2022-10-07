class Demo 
{
	public static int a=10;
	public static void test()
	{
		System.out.println(a);
		System.out.println(Demo.a);
		Demo rv= new Demo();
		System.out.println(rv.a);
	}
	public static void main(String [] args)
	{
		test();
	}
}
