package arrays;

public class Palindrome {
public static void main(String[]args) {
	int a[]= {1,2,3,4,5,1};
	boolean ispal=true;
    for(int i=0;i<a.length-1;i++) {
    	for(int j=a.length-1;j>0;j--) {
    		if(a[i]==a[j]) {
    			ispal=false;
    			break;
    		}
    		if(ispal) {
    		System.out.println("its a pal");
    		}
    		else {
    			System.out.println("its not a palindrome");
    		}
    	}
    }
}

}
