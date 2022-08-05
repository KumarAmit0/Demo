import java.util.Scanner;
public class Matrix
{
	
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	void redData()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.println("Enter value");
				a[i][j]=sc.nextInt();
			}
		}	
	       for(int i=0;i<a.length;i++)
	       {
		        for(int j=0;j<b.length;j++)
				{
					System.out.println("Enter value");
					b[i][j]=sc.nextInt();
				} 
			}      
	 }
	 void add()
	 {
		 int j;
		 for(int i=0;i<a.length;i++)
		 {
			 for( j=0;j<b.length;j++);
			 {
				 c[i][j]=a[i][j]+b[i][j];
				 System.out.println(c[i][j]);
			 }
		 }
	 }

}
