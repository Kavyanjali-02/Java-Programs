package BasicProgram;
import java.util.Scanner;

public class Buzz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a%7==0||a%10==7) {
			System.out.println("buzz no");
		}
		else {
			System.out.println("no buzz num");
		}
	
			
		
	}

}
