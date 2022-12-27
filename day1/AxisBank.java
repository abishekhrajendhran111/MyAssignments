package week5.day1;

public class AxisBank extends BankInfo {
  
	public void deposit() {
		System.out.println("deposit in child class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BankInfo per1=new AxisBank();
       per1.deposit();
       
	}

}
