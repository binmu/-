package homework8_4.two;

/**
 * ��Ŀ����Ŀ��ţ����ƣ���ע��
 * @author student
 *
 */
public class Subject {

	public String subNo;
	public String name;
	public String remark;
	
	public Subject() {
		super();
	}

	public Subject(String subNo, String name, String remark) {
		super();
		this.subNo = subNo;
		this.name = name;
		this.remark = remark;
	}
	
	public String toString() {
		return "\n��Ŀ���:"+this.subNo+"\t����:"+this.name+"\t��ע:"+this.remark;
	}
}
