class Switch 
{
	public static String Position ="On";
	public static void Room()
	{
		System.out.println("While entering into room turn on fan");
	}
}
class Light
{

	public int j=20;
	public void Brightness()
	
	{
		System.out.println("The brightness is very attractive in this room");
	}
}
class Ac
{
	public static void main (String [] args)
	{
		Switch.Room();
		System.out.println("position");
		Light l1=new Light();
		l1.Brightness();
		System.out.println(l1.j);
	}
}

