package stringAssignment;
// WAP to check if the String is a Pangram or not.
public class Assignment3_4 {

	static boolean isPanagram(String s) {
		int flag =0;
		char[] sarr = s.toLowerCase().toCharArray();
		String res="abcdefghijklmnopqrstuvwxyz";
		char[] resarr = res.toLowerCase().toCharArray();
		if(s.length()<26) {
			return false;
		}
		else {
			for(int i=0;i<resarr.length;i++) {
				if(flag==0 && i>1) {
					return false;
				}
				flag=0;
				for(int j=0;j<sarr.length;j++) {
					if(resarr[i] == sarr[j]) {
						flag =1;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s ="fgheijsfwfds";
		System.out.println(isPanagram(s));

	}

}
