interface Inter11
{
	
void show1();
	
}
interface Inter22 extends Inter11
{
	
void show2();
	
}

class A implements Inter22
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
class Interface2 
{
	
	public static void main(String as[])
	{
		A a=new A();
		a.show1();
		a.show2();
	}
}
