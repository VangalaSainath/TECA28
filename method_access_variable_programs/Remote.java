class Remote 
{
	public static int channelnumber=85;
	public void change()
	{
		System.out.println("Change to channelnumber"+channelnumber);
	}

	public static void main(String[] args) 
	{
		Remote r1=new Remote();
		r1.change();
	}
}
