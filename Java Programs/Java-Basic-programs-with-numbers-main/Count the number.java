package BasicProgram;
import java.util.Scanner;
public class CountTheNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("shiny");
		int a=sc.nextInt();
		int count=0;
		while(a>0) {
			count=count+1;
			a=a/10;
		}
		System.out.println(count);
	}

}
