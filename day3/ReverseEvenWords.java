package week2.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] splitText=test.split(" ");
		String rs="";
	    for (int i = 0; i < splitText.length; i++) {
	    	String word=splitText[i];
    		String rw="";
	    	if (i%2!=0) {
				for (int j =word.length()-1 ; j >=0 ; j--) {
					rw = rw + word.charAt(j);
				}
	    	}
				else {
					for (int j2 = 0; j2 < word.length(); j2++) {
						rw = rw + word.charAt(j2);
					}
				}
			
	    	 rs = rs + rw + " ";
	    	}
	    System.out.println(rs);
	    }
	    
	  
	}


