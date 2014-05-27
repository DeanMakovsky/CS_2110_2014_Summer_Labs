package Week_2;

import java.util.Comparator;

public class on5_27_ShortStringsFirst implements Comparator<String> {
	
	@Override
	public int compare(String s, String t) {
		int len = s.length() - t.length();
		if (len != 0) {
			return len;
		} else {
			return s.compareTo(t);
		}
	}

	public static void main(String[] args) {
		on5_27_ShortStringsFirst myComp = new on5_27_ShortStringsFirst();
		System.out.println(myComp.compare("b", "aa"));
		System.out.println(myComp.compare("samenum", "asthiss"));
		/*  sample output:
		 -1
		 18
		 */
		
	}	

}
