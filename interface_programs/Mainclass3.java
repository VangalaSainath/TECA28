 
 interface Cricketer
{
	public void indianteam();
}
interface Player extends Cricketer
{
	public void records();
	public void indianteam();
}
class Name implements Player
{
	public void indianteam()
	{
		System.out.println("Team india contains most powerfulpalyers");
	}
	public void records()
	{
		System.out.println("Sachintendulkar creates so many records");
	}
}

interface State extends Cricketer
{
	public void indianteam();
	public void north();
}
class Zone implements State
{
	public void indianteam()
	{
		System.out.println("Team india contains most powerfulpalyers");
	}
	public void north()
	{
		System.out.println("most of the players are from northside");
	}
}

class Mainclass3 
{
	public static void main(String[] args) 
	{
		Name n1=new Name();
		n1.indianteam();
		n1.records();
		Zone z1=new Zone();
		z1.indianteam();
		z1.north();
	}
}
