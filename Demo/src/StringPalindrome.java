import java.util.Scanner;
public class StringPalindrome 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
	    if(s.equals(rev))
		  System.out.println("The String is palindrome");
		else 
		  System.out.println("The string is not pelindrome");
	}
}
