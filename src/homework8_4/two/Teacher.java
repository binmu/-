package homework8_4.two;



/**
 * .�������ʵ����ֱ���ʦ�����ź��������Ϳ�Ŀ����Ŀ��ţ����ƣ���ע����
 * 2.��һ��HashMap��������ʦ�ܽ�����Щ��Ŀ��
 * 3.���ø���������HashMap��������Ŀ�ֱ�������Щ��ʦ���ڡ����ó�������ȷ��HashMap
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
		return "\n����:"+this.teaNo+"\n����:"+this.name;
	}
}
