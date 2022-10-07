class Program17 
{
	public static void main(String[] args) 
	{
		String s1= "JAVA SQL HTML JDK";
		String[] sArr=s1.split("  ");
		String s2="";
		for (int i=0; i<=sArr.length-1; i++)
		{
			if(i!=sArr.length-1)
			{
				s2=s2+reverse(sArr[i])+" ";
			}
			else
			{
				s2=s2+reverse(sArr[i]);
			}
		}
		System.out.println(s2);
	}
			public static String reverse(String s)
	{
		String rev="";
		for (int i=s.length()-1;i>=0; i--) 
		{
			char c1 =s.charAt(i);
			rev=rev+c1;
		}
		return rev;

		}

	}

