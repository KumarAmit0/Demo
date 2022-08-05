import java.util.Scanner;

public class Strongnumber {
static int isstrong(int x) {
 int sum=0;
while(x>0) {
	int r=x%10;
	sum = sum+fact(r);
	x=x/10;
}
return sum;
}

private static int fact(int r) {
	int fact1=1;
	while(r>0) {
		fact1=fact1*r;
		r--;
		
	}
	return fact1;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
	int x=sc.nextInt();
	int y=isstrong(x);
	if(y==x)
		System.out.println("is strong number");
	else
		System.out.println("not a strong number");
}
}
