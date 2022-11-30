package week1.day1;

public class TwoWheeler {
	int noOfWheels=4;
	int noOfMirrors=3;
	long ChassisNumber=826178317831l;
	boolean isPunctured=false;
	String bikeName="Yamaha";
    double runningKM=15067868.55;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TwoWheeler person1=new TwoWheeler();
         System.out.println("No of Wheels in the bike="+person1.noOfWheels);
         System.out.println("No of mirrors in the bike="+person1.noOfMirrors);
         System.out.println("Chassis Number="+person1.ChassisNumber);
         System.out.println("Whether the bike wheel is punctured?"+person1.isPunctured);
         System.out.println("Name of the bike is "+person1.bikeName);
         System.out.println("running KM of the bike is "+person1.runningKM);
	}

}
