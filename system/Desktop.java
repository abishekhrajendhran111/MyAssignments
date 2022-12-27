package org.system;

public class Desktop extends Computer {
	
    public void desktopSize() {
		System.out.println("1366*768");
	}
    
    public static void main(String[] args) {
		Desktop specs=new Desktop();
		specs.computerModel();
		specs.desktopSize();
	}
}
