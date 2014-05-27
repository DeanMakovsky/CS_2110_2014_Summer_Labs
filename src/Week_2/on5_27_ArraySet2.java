package Week_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class on5_27_ArraySet2<T> implements Set<T> {
	/*
	 * This time we have an ArrayList as a field, rather than inheriting all
	 * methods from ArrayList. This means that we don't have all the previous
	 * methods as before, so we must write each one of them. Most of them are
	 * simple and just involve an operation on out 'list' field. You can use
	 * Eclipse to generate all the method stubs for you.
	 */

	/*
	 * An interesting note: Both ArraySet classes are implemented differently,
	 * but (generally) contain the same fundamental operations. As a result,
	 * they would be called the same way.
	 */

	private ArrayList<T> list;

	public on5_27_ArraySet2() {
		list = new ArrayList<T>();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return list.contains(o);
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

	@Override
	public Object[] toArray() {
		return list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return list.toArray(a);
	}

	@Override
	public boolean add(T e) {
		if (list.contains(e)) {
			return false;
		} else {
			list.add(e);
			return true;
		}
	}

	@Override
	public boolean remove(Object o) {
		return list.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return list.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		boolean retVal = false; 
		for (T value : c) {
			if (list.add(value)) {
				retVal = true;
			}
		}

		return retVal;
	}
	
	@Override
	public boolean retainAll(Collection<?> c) {
		return list.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return list.removeAll(c);
	}

	@Override
	public void clear() {
		list.clear();
	}

}
