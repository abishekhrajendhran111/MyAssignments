package week1.day1;

public class Car {

	public static void applyBrake() {
		System.out.println("Apply brake");
	}
	public static void applyGear() {
		System.out.println("Apply gear");
	}
	public static void SwitchOnAC() {
		System.out.println("On AC");
		
	}
	public static void applyAcclerate() {
		System.out.println("Accelerate Your car");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Car Audi= new Car();
		Car.applyAcclerate();
		Car.applyGear();
		Car.applyBrake();
		Car.SwitchOnAC();

	}

}
