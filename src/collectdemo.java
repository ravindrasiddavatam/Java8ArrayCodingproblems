import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class collectdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,9,9);
		Set<Integer>result = numbers.stream().collect(Collectors.toSet());
		System.out.println(result);
	}

}
