package homework8_0102;

import java.util.ArrayList;

public class ArrayTest<T>{

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<T> sort(T[] array){	//5,9,7,8,6	
		//9,5,7,8,6
		//9,8,5,7,6
		//9,8,7,5,6
		//
		ArrayList<T> results = new ArrayList<T>();
//		System.out.println(array.length);
		for(int index = 0;index<array.length;index++){
			for(int count = index+1;count<array.length;count++) {
				if(((Comparable<T>)array[index]).compareTo(array[count])<0) {
					T temp = array[index];
					array[index]=array[count];
					array[count] = temp;
				}
			}
			results.add(array[index]);
		}
		return results;
	}
	
	public ArrayList<T> reverse(T[] array){			
		ArrayList<T> results = new ArrayList<T>();
		for(int index = array.length-1 ;index>=0;index--){
			results.add(array[index]);
		}
		return results;
	}
}
