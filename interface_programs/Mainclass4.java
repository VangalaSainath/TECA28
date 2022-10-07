;interface  Laptop
{
	public void cost();
}
interface  Memory extends Laptop
{
	public void ramsize();
}
interface  Colour extends Laptop,Memory
{

	public void cost();
	public void ramsize();
    public void silver();
}
class Showroom implements Colour
{
	public void cost()
	{
		System.out.println("The cost of the laptop is=40000");
	}
	public void ramsize()
	{
		System.out.println("The  size of ram is=12gb");
	}
	public void silver()
	{
		System.out.println("The colour is = silver");
	}
}



class Mainclass4 
{
	public static void main(String[] args) 
	{
	Showroom s1=new Showroom();
	s1.cost();
	s1.ramsize();
	s1.silver();

		
	}
}

