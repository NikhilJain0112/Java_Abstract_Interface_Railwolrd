//multiple inheritane
interface inter121
{
	void show1();
}
interface inter2
{
	
	void show2();
	
}

class B implements inter121,inter2
{
	public void show1()
	{
		
		System.out.println("show1");
	}
	public void show2()
	{
		
		System.out.println("show2");
	}
	
}



class Interface3 
{
	public static void main(String as[])
	{
		
		B b=new B();
		b.show1();
		b.show2();
	}
}
