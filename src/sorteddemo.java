import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sorteddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("john","jane","Alice","Bob");
		System.out.println(names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		List<String>sortednames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortednames);
	}

}
