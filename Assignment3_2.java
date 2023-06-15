package stringAssignment;
/*
WAP to reverse a sentence while preserving the position.
Input : “Think Twice”
Output : “kniht eciwt”
*/
public class Assignment3_2 {

	static String reverse(String s) {
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1 =s1 +s.charAt(i);
		}
		return s1;
	}
	public static void main(String[] args) {
		String s="Think Twice";
		String s1[] = {};
		s1 =s.split(" ");
		String s2[] = new String[s1.length];
		for(int i=0;i<s1.length;i++) {
			s2[i] = reverse(s1[i]);
		}
		for(int i=0;i<s2.length;i++)
			System.out.print(s2[i]+" ");
	}

}
