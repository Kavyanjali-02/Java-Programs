package BasicProgram;
import java.util.*;

public class ReverseANumber {
	public static void main(String[] args) {
		int a=121;
		int original=a;
		int reverse=0;
		while(a>0) {
			a=a%10;
			reverse=reverse*10+a;
			a=a/10;
  }
		if(original==reverse) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		
	}
}
}
