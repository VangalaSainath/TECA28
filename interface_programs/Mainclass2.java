interface Army
{
	public void service();
}
interface Regiment extends Army
{
	public void capf();
}
interface Bombdump extends Regiment
{
	public void mkrgvehicle();
}
class Paratrooper implements Bombdump
{
	public void service()
	{
		System.out.println("Indian army having tri services");
	}
	public void capf()
	{
		System.out.println("Central govt having armed forces");
	}
	public void mkrgvehicle()
	{
		System.out.println("Most bombproof vehicles are used");
	}
}


class Mainclass2 
{
	public static void main(String[] args) 
	{
		Paratrooper p1=new Paratrooper();
		p1.service();
		p1.capf();
		p1.mkrgvehicle();
	}
}
