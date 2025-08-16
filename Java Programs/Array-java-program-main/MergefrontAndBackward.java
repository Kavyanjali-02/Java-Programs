package arrays;
import java.util.Arrays;

public class MergefrontAndBackward {
	public static void main(String[]args) {
		int first[]= {1,2,3,4,5};
		int second[]= {6,7,8,9,10};
		int a[]=new int[first.length+second.length];
		int n=0;
		int m=second.length-1;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				a[i]=first[n++];
			}
			else {
				a[i]=second[m--];
			}
		}
		System.out.println(Arrays.toString(a));
	}
	}
