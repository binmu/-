package homeworkAugust.august_8_6;

/**
 * ����TreeMap������¹��ܣ�
 * 1.�������ʵ����ֱ���������ơ�ʱ�����������ڣ��͸��֣��������Ա𣬱�ע����
 * 2.TreeMap���԰��ո������ơ�ʱ���ͷ��������������ʵ�����
 * 3.ͳ��ĳλ���ֹ��������ٵ���
 * @author student
 *
 */
public class Music {

	private String name;        //��������
	private String duration;    //ʱ��
	private String releaseDate; //����ʱ��
	
	private Singer singer;      //����
	
	public Music() {
		
	}

	public Music(String name, String duration, String releaseDate) {
		this.name = name;
		this.duration = duration;
		this.releaseDate = releaseDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public Singer getSinger() {
		return singer;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "���ƣ�"+this.name+"\nʱ����"+this.duration+"\n�������ڣ�"
				+this.releaseDate+"\n����"+this.singer;
	}

}
