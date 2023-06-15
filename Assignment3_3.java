package stringAssignment;

import java.util.Arrays;

//WAP to check if the String is Anagram or not.
public class Assignment3_3 {

	static char[] arrange(String s) {
		char arr[] = {};
		arr = s.toCharArray();
		Arrays.sort(arr);
		return arr;
		
	}
	
	static boolean compare(char[] s1, char[] s2) {
			if(Arrays.equals(s1, s2))
				return true;
		return false;
	}
	
	static boolean isAnagram(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char []arrs1=arrange(s1);
			char []arrs2=arrange(s2);
			if(compare(arrs1,arrs2)) {
				return true;
			}	
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		String s1="Race";
		String s2="Care";
		
		boolean res = isAnagram(s1,s2);
		System.out.print(res);
	}

}
