class Sample 
{
	public int z=10;
	public void display()
	{
		System.out.println(z);
		System.out.println(this.z);
	}
	public static void main(String [] args)
	{
		Sample rv1=new Sample();
		Sample rv2=new Sample();
		Sample rv3=new Sample();
		rv1.display();
		rv2.display();
		rv3.display();
	}


}
