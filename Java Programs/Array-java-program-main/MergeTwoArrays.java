package arrays;

import java.util.Arrays;

public class MergeTwoArrays {
public static void main(String[]args) {
	int first[]= {1,2,3,4,5};
	int second[]= {6,7,8,9,10};
	int n=0;
	int m=0;
	int a[]=new int[first.length+second.length];
	for(int i=0;i<a.length;i++) {
		if(i<first.length) {
			a[i]=first[n++];		
	}
		else {
			a[i]=second[m++];
		}
}
	System.out.println(Arrays.toString(a));
	}
}