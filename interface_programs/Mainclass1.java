 interface Sample1
 {
	 public void walk();
 }
	 interface Sample2 extends Sample1
	 {
		 public void run();
		
	 }
	 class A implements Sample2
	 {
		 public void walk()
		 {
			 System.out.println("Walking is good for health");
		 }
		 public void run()
		 {
			 System.out.println("Ossain bolt is a runner");
		 }
	 }
	 class Mainclass1
	 {

public static void main(String[] args) 
	{
		A a1= new A();
		a1.walk();
		a1.run();
		
	}
}
