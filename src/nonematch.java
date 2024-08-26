import java.util.Arrays;
import java.util.List;

public class nonematch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		boolean result = numbers.stream().noneMatch(n->n<0);
		System.out.println(result);
		
	}

}
