class Book
{
	public static int cost=30;
	public void write()
	{
		int b=5;
		System.out.println(b);
	}
	public static void read()
	{
		System.out.println(cost);
	}
	public static void main(String[]args)
	{
		System.out.println(cost);
		System.out.println(cost);
		System.out.println(cost);
		Book b1=new Book();
		b1.write();
	}
}
