package week2.day2;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int size=arr.length;
		System.out.println("The duplicate elements in an array are");
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
