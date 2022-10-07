interface Sample12
{
	public void sleep();
}
abstract class Bed
{
	abstract public void room();
}
class House extends Bed  implements Sample12
{
	public void room()
	{
		System.out.println("soon after completing studies go and slee p at bed room");
	}
	public void sleep()
	{
		System.out.println("While going to sleep switch of lights");
	}
}




class Mainclass7 
{
	public static void main(String[] args) 
	{
		House h1=new House();
		h1.room();
		h1.sleep();
		

	}
}
