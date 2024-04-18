abstract class Demo
{
	
	// void show();
	abstract void show();
	void show1()
	{
		
		System.out.println("show1");
	}
}
class Abstract3 extends Demo
{
	
	
	// void show1()
	// {
		
		// System.out.println("show2");
	// }
	void show()
	{
		System.out.println("abc");
		
	}
	public static void main(String as[])
	{
		
		Abstract3 a=new Abstract3();
		a.show1();
		a.show();
	}
}