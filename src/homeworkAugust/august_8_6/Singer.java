package homeworkAugust.august_8_6;

/**
 * 歌手（姓名，性别，备注）
 * @author student
 *
 */
public class Singer {

	private String name;   //歌手名字
	private char sex;      //性别
	private String remark; //备注
	
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
		return "姓名:"+this.name+"\n性别:"+this.sex+"\n备注:"+this.remark;
	}
}
