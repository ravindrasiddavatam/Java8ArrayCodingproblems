import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseanArrayInplace {
	
	//reverse an array of elements in place , means without using an extra array
	public static void reverseArrayInplace(int[] arr) {
		IntStream.range(0, arr.length/2).forEach(i -> {
			int temp = arr[i];
			arr[i]=arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
			
		});
		System.out.println("Reversed Array:" +Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseanArrayInplace.reverseArrayInplace(new int[] {1,2,3,4,5});
	}

}
