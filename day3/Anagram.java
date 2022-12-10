package week2.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "posts";
		if(text1.length() == text2.length()) {
			 char[] charArray1 = text1.toCharArray();
		     char[] charArray2 = text2.toCharArray();
		     Arrays.sort(charArray1);
		     Arrays.sort(charArray2);
			 boolean result=Arrays.equals(charArray1,charArray2);
			 if (result) System.out.println(text1+" "+text2+" "+"are an ANAGRAM");
			 else System.out.println(text1+" "+text2+" "+"are not an ANAGRAM");
		}
		else System.out.println(text1+" "+text2+" "+"are not an ANAGRAM");
	}

}
