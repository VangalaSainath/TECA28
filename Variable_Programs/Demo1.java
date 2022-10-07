class Demo1 
{
	public static void display()
	{
	int i=10;
	System.out.println(i);
	}
	public void result()
	{
		double z =2.3;
		System.out.println(z);
	}
	public static void main (String [] args)
	{
		System.out.println("main starts");
		display();
		new Demo1().result();
		System.out.println("Main ends");
	}
}
