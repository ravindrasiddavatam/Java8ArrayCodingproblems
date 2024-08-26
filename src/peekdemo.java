import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class peekdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("apple","banana","cherry");
		List<String>result=words.stream().peek(word->System.out.println("original:" +word))
					  .map(String::toUpperCase)
					  .collect(Collectors.toList());
		
		System.out.println(result);
		
		

	}

}
