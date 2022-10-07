class Laptop 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Laptop l1=new Laptop();
		l1.Type();
	}
public void Type()
	{
	System.out.println("Type starts");
	connectTOProjector();
	System.out.println("Type ends");
	}
	public void connectTOProjector()
	{
		System.out.println("Connected to pin");
		System.out.println("Removed from pin");
	}
}
