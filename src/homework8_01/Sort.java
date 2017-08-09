package homework8_01;

import java.util.Comparator;

public class Sort<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		T one = o1;
		T two = o2;
		if(one.toString().compareTo(two.toString())<0) {
			return 1;
		}
		if(one.toString().compareTo(two.toString())>0) {
			return -1;
		}
		return 0;
	}
	
}
