package homework8_4.two;

/**
 * 科目（科目编号，名称，备注）
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
		return "\n科目编号:"+this.subNo+"\t名称:"+this.name+"\t备注:"+this.remark;
	}
}
