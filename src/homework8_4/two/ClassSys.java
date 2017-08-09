package homework8_4.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class ClassSys {

	public Teacher teacher;
	public Subject subject;
	
	public ClassSys(Teacher teacher, Subject subject) {
		super();
		this.teacher = teacher;
		this.subject = subject;
	}

	ArrayList<ClassSys> arr = new ArrayList<>();
	List<Teacher> teachers = new ArrayList<Teacher>();
	List<Subject> subjects = new ArrayList<Subject>();
	HashMap<Teacher, Subject> teaSub = new HashMap<>();
	
	public ClassSys() {
		teachers.add(0, new Teacher("T001","wang"));
		teachers.add(1, new Teacher("T002","wang1"));
		teachers.add(2, new Teacher("T003","wang2"));
		teachers.add(3, new Teacher("T004","wang3"));
		
		subjects.add(0, new Subject("S001","java","biancheng"));
		subjects.add(1, new Subject("S002","java1","biancheng5"));
		subjects.add(2, new Subject("S003","java2","biancheng56"));
		subjects.add(3, new Subject("S004","java3","biancheng45"));
		
		arr.add(new ClassSys(teachers.get(0), subjects.get(0)));
		arr.add(new ClassSys(teachers.get(0), subjects.get(1)));
		arr.add(new ClassSys(teachers.get(0), subjects.get(2)));
		arr.add(new ClassSys(teachers.get(1), subjects.get(0)));
		arr.add(new ClassSys(teachers.get(1), subjects.get(1)));
		arr.add(new ClassSys(teachers.get(1), subjects.get(2)));
		arr.add(new ClassSys(teachers.get(2), subjects.get(3)));
		arr.add(new ClassSys(teachers.get(3), subjects.get(0)));
		arr.add(new ClassSys(teachers.get(3), subjects.get(1)));
	}
	
	public HashMap<Teacher, List<Subject>> getTea_Subject(){
		HashMap<Teacher, List<Subject>> map = new HashMap<>();
		Iterator<ClassSys> it = arr.iterator();
		while(it.hasNext()){
			ClassSys temp = it.next();
			if(map.containsKey(temp.teacher)){
				List<Subject> subTemp = map.get(temp.teacher);
				subTemp.add(temp.subject);
				map.put(temp.teacher,subTemp);
			}else{
				List<Subject> subTemp = new ArrayList<Subject>();
				subTemp.add(temp.subject);
				map.put(temp.teacher, subTemp);
			}
		}
		return map;
	}
}