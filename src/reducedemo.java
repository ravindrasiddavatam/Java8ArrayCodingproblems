import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reducedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		//List<Integer>numbers = Arrays.asList();
		Optional<Integer>result = numbers.stream().reduce((a,b)->a*b);
		//int result = numbers.stream().reduce((a,b)->a*b); //it will not work
		System.out.println(result);
	}

}
