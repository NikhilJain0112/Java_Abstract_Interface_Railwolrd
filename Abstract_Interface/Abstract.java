abstract class Demo
{
	
	// void show();
	abstract void show();
	void show1()
	{
		
		System.out.println("show1");
	}
}
class Abstract extends Demo
{
	
	
	void show1()
	{
		
		System.out.println("show2");
	}
	void show()
	{
		System.out.println("abc");
		
	}
	public static void main(String as[])
	{
		
		Abstract a=new Abstract();
		a.show();
		a.show1();
	}
}