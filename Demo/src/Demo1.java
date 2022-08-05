public class Demo1
{
	Demo1()
	{
		System.out.println("Cons");
	}
	public void show()
	{
		System.out.println("method");
	}
	public static void main(String[] args) {
//		int i=1;
//		while(i<=5) {
//		System.out.print("*");
//		i++;
//		}
		Demo1 d1=new Demo1();
		d1=new Demo1();
		d1=new Demo1();
		d1.show();
	}
}
