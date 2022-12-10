package week2.day3;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int input=13;
         int count=0;
         int n=1;
         for (int i = 1; i <=input; i++) {
 			if(input%i==0) {
 				count=count+n;
 						
 			}
 		}	
 		if(count==2) {
 			System.out.println(input + " is a prime number");
 		}
 		else 
 			System.out.println(input +" is not a prime number");
 }
	}

