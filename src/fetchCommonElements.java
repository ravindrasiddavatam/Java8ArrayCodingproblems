import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class fetchCommonElements {

	//fetch common elements from given two integer arrays
	private static void fetchCommonElements(int[] arr1, int[] arr2) {
		
		List<Integer> list = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2).anyMatch(arr2Number->arr2Number == number)).boxed().collect(Collectors.toList());
		System.out.println(list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fetchCommonElements.fetchCommonElements(new int[] {1,2,3,4,5}, new int[] {4,5,6,7,8});
	}

}
