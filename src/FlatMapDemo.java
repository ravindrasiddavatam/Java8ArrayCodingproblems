import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collection;
public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> listoforders= Arrays.asList(
			Arrays.asList("one","two"),
			Arrays.asList("three","four")
			);
		
		List<String> result = listoforders.stream().flatMap(Collection::stream)
							 .collect(Collectors.toList());
		System.out.println(result); 
		
		for(String i:result) {
			System.out.println(i);
		}
		
				

	}

}
