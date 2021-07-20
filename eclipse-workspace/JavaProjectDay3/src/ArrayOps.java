import java.util.Arrays;

public class ArrayOps {
	
	public static void main(String[] args) {
		int [] arr1 = new int [] {65,1469,84,136,251,695,816,5185,651,68};
		PrintArray obj1 = new PrintArray();
		obj1.printArray(arr1);
		
		float[] arr2 = new float [] {6.5f,14.69f,8.4f,1.36f,25.1f,6.95f,81.6f,51.85f,65.1f,6.8f};
		obj1.printArray(arr2);
		
		Arrays.sort(arr1);
		obj1.printArray(arr1);
		
		MultiDimArray.main(null);
		
		
	}

}
