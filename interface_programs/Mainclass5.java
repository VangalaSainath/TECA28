interface Java
{
	public void corejava();
}
	class Book implements Java
	{
		public  void corejava()
		{
			System.out.println("Study corejava by using book");
			
		}
	}
	class Laptop implements Java
	{
		public  void corejava()
		{
			System.out.println("execute the programs by using laptop");
		}
	}



class Mainclass5 
{
	public static void main(String[] args) 
	{
			new Book().corejava();
			new Laptop().corejava();

	}
}
