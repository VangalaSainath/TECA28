abstract class Cricket
{
	abstract public void india();

}
abstract class Position extends Cricket
{
	
}
class Name extends Position
{
	public void india()
	{
		System.out.println("Ganguly is president of bcci");
	}
}

class Bcci 
{
	public static void main(String[] args) 
	{
		Name n1=new Name();
		n1.india();
		
	}
}
