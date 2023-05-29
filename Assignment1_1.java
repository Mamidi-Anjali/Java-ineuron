package loops;

public class Assignment1_1 {

	public static void main(String[] args) {
		int i,j,n=8;
		char a='+';
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0 || i == n-1 || j == (n-1)/2) {
					System.out.print(a);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print(a);
				}
				else {
					System.out.print(" ");
				}
			}
			
		   System.out.print("  ");
		   
		   for(j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || i== (n-1)/2 ) {
					System.out.print(a);
				}
				else {
					System.out.print(" ");
				}
			}
			
		   System.out.print("  ");
		   
		   for(j=0;j<n;j++) {
				if(j==0 && i!=n-1 || j==n-1 || i==n-1 ) {
					System.out.print(a);
				}
				else {
					System.out.print(" ");
				}
			}
			
		   System.out.print("  ");
		   
		   for(j=0;j<n;j++) {
				if(i==0  || j==0 || i==(n-1)/2 || (j==n-1 && i<= (n-1) /2) || (i ==j && i >(n-1)/2)) {
					System.out.print(a);
				}
				else {
					System.out.print(" ");
				}
			}
			
		   System.out.print("  ");
		   
		   for(j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || j== n-1) {
					System.out.print(a);
				}
				else {
					System.out.print(" ");
				}
			}
			
		   System.out.print(" ");
		   
		   for(j=0;j<n;j++) {
				if(j==0 || j==n-1 || j==i ) {
					System.out.print(a);
				}
				else {
					System.out.print(" ");
				}
			}
			
		   System.out.println("  ");
		   
		}

	}

}
