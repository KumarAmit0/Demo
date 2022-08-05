public class Demo {
	String firstName;
	String lastName;
	Demo(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public static void main(String[] args) {
		Demo d=new Demo("Abhilas", "panday");
		System.out.println(d.firstName+ " "+d.lastName);

	}

}
