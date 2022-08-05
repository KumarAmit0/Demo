import java.util.Scanner;
public class MoneyCovetor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter monetry amount:");
		double OriginalAmount=sc.nextDouble();
		System.out.println("That's the equivalent to:");
		double amountInPennies=(int)(OriginalAmount*100);
		double reamaInbalance=(int)(amountInPennies%1000);
		int tenDoller=(int)(amountInPennies/1000);
		System.out.println(tenDoller+" ten dollers bills");
		int fiveDoller=(int)(amountInPennies%1000/500);
		System.out.println(fiveDoller+" five dollers bills");
		int oneDoller=(int)(amountInPennies%1000%500/100);
		System.out.println(oneDoller+" one dollers bills");
		int quater=(int)(amountInPennies%1000%500%100/25);
		System.out.println(quater+" Quaters");
		int dime=(int)(amountInPennies%1000%500%100%25/10);
		System.out.println(dime+" Dime");
		int nickel=(int)(amountInPennies%1000%500%100%25%10/5);
		System.out.println(nickel+" Nickel");
		int pennies=(int)(amountInPennies%1000%500%100%25%10%5/1);
		System.out.println(pennies+" pennies");
	}

}
