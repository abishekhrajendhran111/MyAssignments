package week5.day1;

public class Student {
	
	public void getStudentInfo(int id) {
		System.out.println("id: "+id);
	}
    public void getStudentInfo(int id,String name) {
		System.out.println("id: "+id+" "+",Name: "+name);
	}
    public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("emailId: "+email+" "+",Contact Number: "+phoneNumber);
	}




	public static void main(String[] args) {
		Student obj1=new Student();
		obj1.getStudentInfo(1);
		obj1.getStudentInfo(1, "Abishekh");
		obj1.getStudentInfo("abishekh01112000@gmail.com",9629968607l);

	}

}
