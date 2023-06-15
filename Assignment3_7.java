package stringAssignment;
//WAP to count the number of Vowels and Consonants of a String value.
public class Assignment3_7 {
	static int[] countVowelsCons(char[] sarr) {
		int count[] = new int[2];
		count[0]=0;
		count[1]=0;
		for(int i=0;i<sarr.length;i++) {
			if(sarr[i]== 'a' || sarr[i] == 'e' || sarr[i] == 'i' || sarr[i]== 'o' || sarr[i] =='u') {
				//System.out.println("vowel   .."+sarr[i]  );
				count[0]++;
			}
			else {
				if(sarr[i]>='a' && sarr[i]<='z') {
					//System.out.println("consonent   .."+sarr[i]  );
					count[1]++;
				}
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		String s="da)! z Z #(321   sf# io X$$%";
		s= s.replaceAll("\\s", "");
		char sarr[] = s.toLowerCase().toCharArray();
		int count[] =  countVowelsCons(sarr);
		System.out.println("no.of vowels = "+count[0]);
		System.out.println("no.of consonents = " +count[1]);
		

	}

}
