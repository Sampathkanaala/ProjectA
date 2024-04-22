package Pac;

public class Palyndrome {

	public static void main(String[] args) {
		String str = "madam";
		
		String rev = "";
		String orgStr = str;
		for(int i=0; i<=str.length()-1; i++) {
			rev = str.charAt(i)+rev;
		}
		if(rev.equals(orgStr)) {
			System.out.println(rev+ " is a palindrome");
		}else {
			System.out.println(rev+ " is a palindrome");
	
		}

	}

}
