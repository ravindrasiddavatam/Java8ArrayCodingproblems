import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("apple","banana","orange");
		List<String>result=words.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(result);

	}

}
