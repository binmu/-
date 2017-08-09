package course.test;



public class Student implements Comparable<Object>{
	public String stuNo;
	public String name;
	
	public String toString(){
		return "{学号："+this.stuNo+"；姓名："+this.name+"；}";
	}
	 
//	compareTo(Object)
	
	public int compareTo(Object o){
		if(!(o instanceof Student)){
			return -1;
		}
		Student stu = (Student) o;
//		return this.name.compareTo(stu.name);		
//		return -1*this.stuNo.compareTo(stu.stuNo);
		if(this.stuNo.compareTo(stu.stuNo) !=0){
			return this.stuNo.compareTo(stu.stuNo);
		}
		return this.name.compareTo(stu.name);	
	}
	
 	public boolean equals(Object anObject){
		System.out.println("equals");
		if(anObject == null){
			return false;
		}
		Student tempStu = (Student)anObject;
		if(tempStu.stuNo.equals(this.stuNo) && tempStu.name.equals(this.name)){
			return true;
		}
		return false;
	}
}

