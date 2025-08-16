package BasicProgram;
import java.util.Scanner;

public class ReverseWithoutRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter:");
		int a=sc.nextInt();
		while(a>0) {
		  int last=a%10;
		  System.out.println(last);
		  a=a/10;
		}
		
	}

}
