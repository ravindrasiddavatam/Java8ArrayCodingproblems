import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinctdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,4,4,5,5,6);
		List<Integer> distinct=numbers.stream()
				                       .distinct()
				                       .collect(Collectors.toList());
		// Here we can use set also, but data is not preserved in order, if want to preserve data in insertion order , then 
		//we can use distinct
		System.out.println(distinct);
		for(int i:distinct) {
			System.out.println(i);
		}
	}

}
