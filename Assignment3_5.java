package stringAssignment;
//WAP to print repeatedly occurring characters in the given String.
public class Assignment3_5 {

	public static void main(String[] args) {
		String s= "adhjd fhg adfs klmnopq ffasga";
		s= s.replaceAll("\\s", "");
		char []sarr = s.toCharArray();
        for(int i=0;i<sarr.length-1 ;i++) {
        	int count=0;
			for(int j=i+1;j<sarr.length  ;j++) {
				if(sarr[i]==sarr[j] && sarr[i]!='0') {
					if(count==0) {
						count++;
						System.out.print(sarr[j]);
					
					}
				   sarr[j]='0';
								
				}
			}
		}

	}

}
