abstract class Room
{ 
	abstract public void benches();
}
class Session extends Room
{
	public void benches()
	{ 
		System.out.println("Make sure that fill all the benches");
	}
}
class Hall
{
	public Room full()
	{
		Room r1=new Session();
	return r1;
	}

}
class Mainclass
{
	public static void main(String[] args) 
	{
		Hall h1=new Hall();
		Room rv=h1.full();
		
		rv.benches();
	}
}
