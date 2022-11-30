package week1.day1;

public class Mobile {
	String mobileBrandName="Iphone";
    char mobileLogo='A';
	short noOfMobilePiece=6;
	int modelNumber=4764278;
	long mobileIMEInumber=36378612783152l;
	float mobilePrice=1000000.00f;
    boolean isDamaged=false;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mobile person=new Mobile();
        System.out.println("Mobile brand name "+person.mobileBrandName);
        System.out.println("Mobile logo "+person.mobileLogo);
        System.out.println("No of mobile pieces "+person.noOfMobilePiece);
        System.out.println("Mobile model number "+person.modelNumber);
        System.out.println("Mobile IMEI number "+person.mobileIMEInumber);
        System.out.println("Mobile Price is "+person.mobilePrice);
        System.out.println("Whether the mobile is damaged "+person.isDamaged);
	}
	

}
