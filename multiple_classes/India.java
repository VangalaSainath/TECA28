class Army
{
	public static int BSF=36;
	public String Force="ARMED";
}
class Commando
{
	public static void Ranked()
	{
		System.out.println("BDL");
	}
}
	class Regiment
	{
		public void Name()
		{
			Army a1=new Army();
			System.out.println(a1.Force);
			Commando.Ranked();
		}

	}
	class India
	{
		public static void main(String [] args)
		{
			System.out.println("Peace behind the force");
			Regiment r1=new Regiment();
			r1.Name();

			System.out.println("Cannot control after destruction");
		}
	}
