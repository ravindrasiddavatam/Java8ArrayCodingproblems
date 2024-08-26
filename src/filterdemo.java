import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> result  = numbers.stream().filter(n->n>5).collect(Collectors.toList());
//		for(int i:result) {
//			System.out.println(i);
//		}
		System.out.println(result);

	}

}
