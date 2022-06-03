import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NthHighestRecord {

	public static void main(String args[]) {
		List<Integer> inputList = Arrays.asList(1,7,1,2,9,2,3,3,11,19,5);
		int n = 2;
		int nValue = inputList.stream()
						.distinct()
						.sorted(Comparator.reverseOrder())
						.collect(Collectors.toList())
						.get(n-1);
		System.out.println("the "+n+"-th highest value in "+inputList+" is : "+nValue);
	}
}
