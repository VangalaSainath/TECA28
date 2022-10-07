class WashingMachine 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Rinse();
		System.out.println("main ends");
	}
public static void Rinse()
	{
	System.out.println("Rinse starts");
	WashingMachine w1=new WashingMachine();
	w1.Spin();
	System.out.println("Rinse ends");
	}
	public void Spin()
	{
		System.out.println("Spin starts");
		System.out.println("Spin ends");
	}
}
