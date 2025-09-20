package interviewPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNames {

	public static void main(String[] args) {
		 List<String> names = Arrays.asList("Siripuram", "Reddy", "Damodar", "Vemula","Rohini");

	        List<String> filteredNames = names.stream()
	                                          .filter(name -> name.startsWith("S"))
	                                          .collect(Collectors.toList());

	        System.out.println("Names starting with 'S': " + filteredNames);

	}

}
