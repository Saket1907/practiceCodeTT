package practiceCodeTT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList1 = new ArrayList<String>();
		List<String> myList2 = new ArrayList<String>();
		List<String> myList3 = new ArrayList<String>();

		myList1.add("ramesh");
		myList1.add("suresh");

		myList2.add("rahul");

		myList3.add("pankaj");
		myList3.add("reena");

		Map<String, List<String>> myMap = new HashMap<String, List<String>>();

		myMap.put("saket", myList1);
		myMap.put("pankaj", myList2);
		myMap.put("suresh", myList3);

		myMap.entrySet().stream().forEach(q -> System.out.println(q.getKey() + "->" + q.getValue()));

	}

}
