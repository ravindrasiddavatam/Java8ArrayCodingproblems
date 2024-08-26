import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findfirstdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names =Arrays.asList("apple","banana","Mango");
		Optional<String> name = names.stream().filter(word->word.startsWith("b")).findFirst();
		System.out.println(name);

	}

}
