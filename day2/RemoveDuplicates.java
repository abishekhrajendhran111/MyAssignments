package week2.day2;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splitText=text.split(" ");

		int count=0;
		List<String> text1=new ArrayList<String>();
	
		for (int i = 0; i < splitText.length; i++) {
			for (int j = i+1; j < splitText.length; j++) {
				if(splitText[i].equals(splitText[j]))
					count+=1;
			}
			if (count<1) {
				text1.add(splitText[i]);
			}
			count=0;
		}
		for (int k = 0; k < text1.size(); k++) {
			System.out.println(text1.get(k));
		}
		
	

	}

}
