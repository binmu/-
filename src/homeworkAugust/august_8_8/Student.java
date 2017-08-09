package homeworkAugust.august_8_8;



/**
 * 学生对象有如下属性：学号id
 * 姓名name
 * 性别gender
 * 评分score
 */
public class Student {
	private String id;
	private String name;
    private String gender;
    private double score;

    public Student() {
    }

    public Student(String id,String name, String gender) {
    	this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getId() {
    	return id;
    }
    
    public void setId(String id) {
    	this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
	
	public String toString() {
		return this.getId()
				 + "\t"+this.getName()
				 + "\t"+this.getGender()
				 + "\t"+this.getScore();
	}
}

