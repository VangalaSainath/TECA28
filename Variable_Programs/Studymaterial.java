class Studymaterial 
{
	public  String book ="Power systems";
	public void Study()
	{
		System.out.println("Read concepts");
	}

	public static void main(String[] args) 
	{
		System.out.println("Redy for seminar");
		Studymaterial s1=new Studymaterial();
		s1.Study();
		System.out.println(new Studymaterial().book);
		System.out.println("Performance");

	}
}
