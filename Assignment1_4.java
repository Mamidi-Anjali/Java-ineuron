package loops;

public class Assignment1_4 {

	public static void main(String[] args) {
		int i,j,n =15, m=14;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(  i-j >(m-1)/2 || i+j >= m-1 + m/2  || i == n-1 || i== n-2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
