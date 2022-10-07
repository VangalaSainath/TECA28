class  OverloadwithNonStaticmethod  
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		new OverloadwithNonStaticmethod().main(true);
		System.out.println("Main ends");

	}
public void main(boolean z)
	{
	System.out.println("Mian method with boolean argz"+z);
	}
}

