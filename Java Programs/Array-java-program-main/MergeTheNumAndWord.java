package arrays;

import java.util.Arrays;

public class MergeTheNumAndWord {
public static void main(String[]args) {
	String first[]= {"1","2","3"};
	String second[]= {"a","b","c"};
	String a[]=new String[first.length+second.length];
	int n=0;
	int m=0;
	for(int i=0;i<a.length;i++) {
		if(i%2==0) {
			a[i]=first[n++];
		}
		else {
			a[i]=second[m++];
		}
	}
	System.out.println(Arrays.toString(a));
}
}
