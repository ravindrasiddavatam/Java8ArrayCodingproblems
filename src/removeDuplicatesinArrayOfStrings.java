import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicatesinArrayOfStrings {
	
	public static String[] removeDuplicates(String[] input) {
        List<String> result = Arrays.stream(input)
                                    .distinct()
                                    .collect(Collectors.toList());
        // toArray(new String[0]): Converts the List back into an array.
        return result.toArray(new String[0]);
        //check below cases
//        return result.toArray(new String[10]);
//        return result.toArray(new String[2]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String[] strings = {"apple", "banana", "apple", "orange", "banana", "grape"};
	        String[] result = removeDuplicates(strings);

	        for (String str : result) {
	            System.out.println(str);
	}

}
}
