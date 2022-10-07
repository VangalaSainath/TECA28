class  Attendance
{
	public static String a = "Present";
	public static void pass()
	{
		System.out.println("Appear for exams");
	}
	public static void main(String[] args) 
	{
		System.out.println(" Exam starts");
		pass();
		System.out.println(new Attendance().a);
		System.out.println("Exam ends");
	}
	}
