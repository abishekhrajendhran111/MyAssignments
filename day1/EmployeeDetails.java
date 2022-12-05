package week2.day1;

public class EmployeeDetails {

	public void printEmployeeName(String empName, int empId)  {
		System.out.println(empName);
		System.out.println(empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println(empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println(mobNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employee=new EmployeeDetails();
		
		employee.printEmployeeName("Duckling", 1);
		employee.getEmployeeAddress("24/L-137,Chennai");
		employee.printEmployeeSalary(2200000.00);
		employee.printEmployeeMobileNumber(8870568607l);
		
		
		

	}
	
}
