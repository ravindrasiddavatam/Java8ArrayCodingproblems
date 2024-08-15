import java.util.Arrays;

public class Java8ArrayProblems {
	
	
	private static void findSecondSmall(double[] arr) {
//		double secondSmall= Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow(()->new IllegalArgumentException("Array does not have the second smallest element."));
//		System.out.println(secondSmall);
		
		//if arr has duplicate elements
		double secondSmallinDuplicates= Arrays.stream(arr).sorted().distinct().skip(1).findFirst().orElseThrow(()->new IllegalArgumentException("Array does not have the second smallest element."));
		System.out.println(secondSmallinDuplicates);
	}
	
	//(int)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java8ArrayProblems js= new Java8ArrayProblems();
		Java8ArrayProblems.findSecondSmall(new double[] {1.2,2.1,3.1,4.1});
		//new int[]{1, 2, 3, 4, 5}
		

	}

}
