class Fan 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Fan f1=new Fan();
		f1.wings();
		System.out.println("main ends");
	}
public void wings()
	{
	System.out.println("Rotate starts");
	Room();
	System.out.println("Rotate ends");
	}
	public static void Room()
	{
		System.out.println("Room opens");
		System.out.println("R00m closes");
	}
}
