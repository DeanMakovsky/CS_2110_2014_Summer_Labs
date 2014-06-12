package Maps;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class on6_12_maps {

	public static Set<String> findUniqueWords(Scanner s) {
		Set<String> ret = new TreeSet<String>();
		while (s.hasNext()) {
			// Since Sets do not allow duplicates, we can just keep adding the words and it will automatically omit duplicates
			ret.add(s.next().toLowerCase());
		}
		return ret;
	}

	public static Map<String,Integer> countWords(Scanner s) {
		Map<String, Integer> ret = new TreeMap<String,Integer>();
		while (s.hasNext()) {
			String str = s.next().toLowerCase();
			if (ret.containsKey(str)) { // If our map already contains the value, get the current value and increment it by one
				ret.put(str, ret.get(str)+1); // Map.put() automatically overwrites the previous entry.
			} else { // Otherwise create an entry for it.
				ret.put(str,1);
			}
		}
		
		return ret;
	}
	
	public static Map<Integer, Set<String>> reverseMap(Map<String,Integer> m) {
		Map<Integer, Set<String>> ret = new TreeMap<Integer, Set<String>>();
		
		for ( String str : m.keySet()) { // iterate through all Strings in the given map
			int mValue = m.get(str); // get the corresponding value in the given map
			if (ret.containsKey(mValue)) {
				ret.get(mValue).add(str); // add the current string to the set
			} else { // make a new Set and put it into our return Map
				Set<String> temp = new TreeSet<String>();
				temp.add(str);
				ret.put(mValue, temp);
			}
		}
		
		return ret;
	}
	
	public static void print(Map<? extends Object, ? extends Object> m) {
		for (Object o : m.keySet()) {
			System.out.println(o.toString() + ": " + m.get(o).toString());
		}
	}
	
	public static void main(String[] args) {
		// Testing
		
		Set<String> unique = findUniqueWords(new Scanner("I am Sam Sam I am That Sam I am That Sam I am I do not like that Sam I am"));
		System.out.println(unique.size());

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		Map<String, Integer> count = countWords(new Scanner("I am Sam Sam I am That Sam I am That Sam I am I do not like that Sam I am"));
		System.out.println(count.get("sam"));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println(count);
		System.out.println(reverseMap(count));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		print(count);
		
	}
}
