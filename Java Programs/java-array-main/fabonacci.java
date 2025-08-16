package BasicProgram;

public class Fabonacci{
	public static void main(String[] args) {
		int f=1;
		int s=2;
		for(int i=0; i<=10;i++) {
			int t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}
		
		}
	}

