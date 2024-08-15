import java.util.Arrays;

public class longestStringinArrayOfStrings {
	
	public static void longestString(String[] arr) {
		int maxLength = Arrays.stream(arr).mapToInt(String -> String.length()).max().orElse(0);
		//method referencing
		//int maxLength1 = Arrays.stream(arr).mapToInt(String::length).max().orElse(0);
		System.out.println(maxLength);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestStringinArrayOfStrings.longestString(new String[] {"Apple","Avacado","Banana"});

	}

}
