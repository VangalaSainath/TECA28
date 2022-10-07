class Radio
{
	public void spotify()
	{
		System.out.println("Listen the melody songs on radio");
	}
}
interface Telivision 
{
	public void spotify();
}
class  Mobile extends Radio implements Telivision
{
	public void spotify()
	{
		System.out.println("As well as listen songs on spotify ");
	}
	

}


class  Mainclass10
{
	public static void main(String[] args) 
	{
		new Mobile().spotify();
		
	}
}
