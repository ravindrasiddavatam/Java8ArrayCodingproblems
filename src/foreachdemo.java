import java.util.Arrays;
import java.util.List;

public class foreachdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>words = Arrays.asList("apple","banana","cherry");
		words.stream().forEach(word->System.out.println("Item:" + word));
	}

}
