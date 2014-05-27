package Week_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class on5_27_ArraySet<T> extends ArrayList<T> implements Set<T> {
	/*
	 * There are two kinds of methods we have to write: 
	 * 1 ) Methods that are in
	 * the Set interface, but not already implemented in ArrayList. It happens
	 * that there are no such methods. 
	 * 2 ) Methods that are already implemented
	 * in ArrayList, but must be overridden to conform to the Set interface.
	 * This happens to be all methods we need to write.
	 */

	public boolean add(T item) {
		if (this.contains(item)) {
			return false;
		} else {
			super.add(item); // fun fact! calling this.add(item) would result in
								// infinite recursive loop.
			return true;
		}
	}

	public boolean addAll(Collection<? extends T> c) {
		// the reason we have to write "? extends E" is because we don't really
		// care what class is passed in -- just as long as it inherits from type
		// T at some point.
		boolean retVal = false; // see official documentation for return value
								// specs
		for (T value : c) { // because c is a Collection, we can do this
							// (Collection implements *iterable*)
			if (this.add(value)) { // this performs the addition as well as
									// tells us if something changed
				retVal = true;
			}
		}

		return retVal;
	}

	// it may be arguable to write an equals method, since we no longer care to
	// differentiate between ArrayList and Set, but I'm going to omit this.

}
