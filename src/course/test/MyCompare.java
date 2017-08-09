package course.test;

import java.util.Comparator;

public class MyCompare implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Student stu = (Student) o1;
		Student stuOne = (Student) o2;
		if(stu.name.compareTo(stuOne.name) !=0){
			return stu.name.compareTo(stuOne.name);
		}
		return stu.stuNo.compareTo(stuOne.stuNo);	
	}

}
