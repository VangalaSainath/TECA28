class Demo 
{
	public static double i=1.8;
	public int j=23;
}
class Smaple
{

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Demo rv=new Demo();
		System.out.println(rv.j);
		System.out.println(Demo.i);
		System.out.println("Main ends");

	}
}
