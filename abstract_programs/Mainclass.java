abstract class A
{
	public void Run()
	{
		System.out.println("Run fast");
	}
		abstract public void Walk();
}
class B extends A
{
	public void Walk()
	{
		System.out.println("Walk everyday");
	}

}

class Mainclass
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.Walk();
		b1.Run();
	}
}
