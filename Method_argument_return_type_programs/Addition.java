class Addition
{
	public static void main(String [] args)
	{
		System.out.println("Main starts");
		Add (5,6);
		System.out.println("Main ends");
	}
	public static void Add(int i,int j)
	{
		int k = i+j;
		System.out.println("i value:"+i);
		System.out.println("j value:"+j);
		System.out.println("Sum value:"+k);
	}
}