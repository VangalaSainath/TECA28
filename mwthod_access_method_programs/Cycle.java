class Cycle 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		ride();
		System.out.println("Main ends");
	}
public static void ride()
	{
	System.out.println("ride starts");
	repair();
	System.out.println("ride ends");
	}
	public static void repair()
	{
		System.out.println("repair starts");
		System.out.println("repair ends");
	}
}

