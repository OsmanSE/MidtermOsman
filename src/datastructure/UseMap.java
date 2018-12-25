package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Yousif Ali");
		map.put(2, "Marwa Zahid");
		map.put(3, "Ahlam Abid");
		map.put(4, "Zaynab Ali");
		//using for each loop
		for (Map.Entry entry : map.entrySet()) {
			System.out.println( entry.getKey() + " -> " + entry.getValue() );
		}
		//using while
		Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<Integer, String> entry = entries.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

}
