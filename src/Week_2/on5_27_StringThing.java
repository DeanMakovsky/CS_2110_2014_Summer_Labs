package Week_2;

import java.util.Iterator;

public class on5_27_StringThing implements Iterable<Character>{
	
	private String data;
	
	public on5_27_StringThing (String s) {
		data = s;
	}

	@Override
	public Iterator<Character> iterator() {
		return new StringIter(data); // class definition below
	}
	
	public static void main(String[] args) {
		//just for a test
		on5_27_StringThing myObject = new on5_27_StringThing("Hello World!");
		for (Character c : myObject) { // this is what it means to be "iterable"
			System.out.println(c);
		}
		
		/* equivalent statement :
		 
		Iterator<Character> iter = myObject.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		*/
	}

}

// ~~~~~~~~~~~ Here begins another class ~~~~~~~~~~

class StringIter implements Iterator<Character>{
	
	private String myData;
	private int i;
	
	public StringIter(String theData) {
		myData = theData;
		i = 0;
	}

	@Override
	public boolean hasNext() {
		if (i < myData.length()){
			return true;
		}
		return false;
		
	}

	@Override
	public Character next() {
		Character a = new Character(myData.charAt(i));
		i++;
		return a;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
}

