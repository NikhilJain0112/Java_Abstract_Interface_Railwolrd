interface A1
{
	
	
	void show();
}
class Demo implements A1
{
	
	public void show()
	{
		
		System.out.println("sajal");
	}
}
class Interface5
{
	
	
	public static void main(String as[])
	{
		
		Demo d=new Demo();
		d.show();
	}
}