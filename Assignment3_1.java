package stringAssignment;

/*
1. WAP to reverse a String.
Input: “iNeuron”
Output: “norueNi”
 */
public class Assignment3_1 {
	public static void main(String args[]) {
		String s = "iNeuron";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1 =s1 +s.charAt(i);
		}
		System.out.println(s1);
	}

}
