abstract class Demo1
{
	
	// void show();
	abstract void show();
	
}
class Demo2 extends Demo1
{
	
	
	void show()
	{
		System.out.println("Demo2");
		
	}
}
class Abstract2
{
	public static void main(String as[])
	{
		
		Demo2 a=new Demo2();
		a.show();
		
	}
}