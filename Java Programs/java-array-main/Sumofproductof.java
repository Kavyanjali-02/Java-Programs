package BasicProgram;
import java.util.*;
import java.util.Scanner;
public class SumofProductof {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        int product=1;
        while(a>0) {
        	int last=a%10;
        	sum=sum+last;
        	a=a/10;
        }
        System.out.println(sum);
        while(b>0) {
        	int last=b%10;
        	product=product*last;
        	b=b/10;
        }
        System.out.println(product);
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
