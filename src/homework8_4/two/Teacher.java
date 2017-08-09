package homework8_4.two;



/**
 * .完成两个实体类分别老师（工号和姓名）和科目（科目编号，名称，备注）；
 * 2.做一个HashMap来描述老师能教授哪些科目；
 * 3.利用刚做出来的HashMap来作出科目分别能由哪些老师教授。最后得出两个正确的HashMap
 * @author student
 *
 */
public class Teacher {

	public String teaNo;
	public String name;
	
	public Teacher() {
		super();
	}

	public Teacher(String teaNo, String name) {
		super();
		this.teaNo = teaNo;
		this.name = name;
	}
	
	public String toString() {
		return "\n工号:"+this.teaNo+"\n姓名:"+this.name;
	}
}
