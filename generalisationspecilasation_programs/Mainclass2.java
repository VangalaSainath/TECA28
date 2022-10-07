class Shape
{
	public void fill()
	{
		System.out.println("fill the colour");
	}
	public void outline()
	{
		System.out.println("increase the darkness of outline");
	}
	public void animation()
	{
		System.out.println("Animate each and every hape");
	}
}
class Circle extends Shape
{
}
class Rectangle extends Shape
{
}
class Triangle extends Shape
	{
	}


class Mainclass2 
{
	public static void powerpoint(Shape s1)
	{
		s1.fill();
		s1.outline();
		s1.animation();
	}
	public static void main(String[] args) 
	{
		powerpoint(new Circle());
		powerpoint(new Rectangle());
		powerpoint(new Triangle());
	}
}

