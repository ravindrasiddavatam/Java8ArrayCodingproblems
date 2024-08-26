import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class limitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		List<Integer>limitednumbers=numbers.stream().limit(3).collect(Collectors.toList());
		
		System.out.println(limitednumbers);

	}

}
