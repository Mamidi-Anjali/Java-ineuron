package stringAssignment;
//WAP to count number of special characters.
public class Assignment3_8 {

	static int isSpecialChar(char[] sarr) {
		int count =0;
		for(int i=0;i<sarr.length;i++) {
			
			if(sarr[i]>=97 && sarr[i]<=122) {
				//do nthg
			}
			else if(sarr[i]>=49 && sarr[i]<=57) {
				//do nthg
			}
			else {
				System.out.println(sarr[i]);
				count++;
			}
			
				
		}
		return count;
	}
	public static void main(String[] args) {
		
		String s="da)! z Z #(321   sf#  X$$%";
		s= s.replaceAll("\\s", "");
		char sarr[] = s.toLowerCase().toCharArray();
		System.out.println(isSpecialChar(sarr));
		
	}

}
