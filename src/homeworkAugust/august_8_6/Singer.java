package homeworkAugust.august_8_6;

/**
 * ���֣��������Ա𣬱�ע��
 * @author student
 *
 */
public class Singer {

	private String name;   //��������
	private char sex;      //�Ա�
	private String remark; //��ע
	
	public Singer() {
	}

	public Singer(String name, char sex, String remark) {
		this.name = name;
		this.sex = sex;
		this.remark = remark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "����:"+this.name+"\n�Ա�:"+this.sex+"\n��ע:"+this.remark;
	}
}
