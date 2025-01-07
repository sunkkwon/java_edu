package Day01;

public class CallByReference {

	public static void setArr(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		
		System.out.println("::::::: setArr() Method ::::::");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1);
		}
		
		System.out.println("::::: main 메소드 ::::");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		setArr(arr);

		System.out.println("::::: main 메소드 호출후 ::::");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
