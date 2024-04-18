interface Inter1 
{
void show();
void show1();
// void show1()
// {
	// System.out.println("Interr1");
// }
}

class Interface1 implements Inter1
{

 public void show()
{
	
	System.out.println("abc");
	
}
public void show1()
{
	
	System.out.println("Inter11");
	
}
public static void main(String as[])
{
 
 Interface1 i=new Interface1();
 i.show();
 i.show1();
}
}
