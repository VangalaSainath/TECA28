class Run 
{
	public static void Everyday()
		
	{
		System.out.println("Run everyday");
	}
		public static  int a =365;
	
}
class Water
{
	public void Drink()
	{
		System.out.println("Drink evaryday");
	}
	public int k=7;

}
class Eat
{
	public static  void main(String [] args)
	{
		System.out.println("Main starts");
	Run.Everyday();
			System.out.println("365days");
		Water w1=new Water();
		w1.Drink();
		System.out.println(w1.k);
		System.out.println("Main ends");
	}


}