interface Human
{
	public void structure();
}
	interface Body
	{
		public void parts();
	}
	class Science implements Human,Body
	{
		public void structure()
		{
			System.out.println(" every one having differnt structural body ");
		}
		public void parts()
		{
			System.out.println("each parts give strength to structure");
		}


	}

class Mainclass6

{
	public static void main(String[] args) 
	{
		Science s1=new Science();
		s1.structure();
		s1.parts();
	}
}
