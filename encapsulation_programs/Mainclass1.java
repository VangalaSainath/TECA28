class Calender
{
	private int monthnum;
	public void givemonthnum(int monthnum)
	{
		if (monthnum>=1 && monthnum<=12)
		{
			this.monthnum=monthnum;
		}
		else
		{
			System.err.println("Invalid monthnum");

	}
}

public void displaymonthname()
	{
	switch (monthnum)
	{
	case 1:System.out.println("JAN");
	    break;
	case 2:System.out.println("FEB");
		break;
	case 3:System.out.println("MAR");
		break;
	case 4:System.out.println("APRL");
		break;
	case 5:System.out.println("MAY");
		break;
	case 6:System.out.println("JUNE");
		break;
	case 7:System.out.println("JULY");
		break;
	case 8:System.out.println("AUG");
		break;
	case 9:System.out.println("SEP");
		break;
	case 10:System.out.println("OCT");
		break;
	case 11:System.out.println("NOV");
		break;
	case 12:System.out.println("DEC");
		break;
	}

	}
	
	}
	
class Mainclass1 
{
	public static void main(String[] args) 
	{
		Calender c1=new Calender();
		c1.givemonthnum(12);
		c1.displaymonthname();
	}
}

