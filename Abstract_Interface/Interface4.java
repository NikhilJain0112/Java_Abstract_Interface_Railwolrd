interface abc
{
	// default void show()
	// {
		// System.out.println("j");
	// }
void show();
	
}
class I implements abc
{
 public void show()
 {
	 
	 System.out.println("P");
 } 
 
 public static void main(String as[])
 {
	 
	 Interface4 i=new Interface4();
	 i.show();
	 
 }
}