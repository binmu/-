package homeworkAugust.august_8_6;

/**
 * 利用TreeMap完成以下功能：
 * 1.完成两个实体类分别歌曲（名称、时长、发布日期）和歌手（姓名，性别，备注）；
 * 2.TreeMap可以按照歌曲名称、时长和发布日期来进行适当排序
 * 3.统计某位歌手共发布多少单曲
 * @author student
 *
 */
public class Music {

	private String name;        //歌曲名称
	private String duration;    //时长
	private String releaseDate; //发布时间
	
	private Singer singer;      //歌手
	
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
		return "名称："+this.name+"\n时长："+this.duration+"\n发布日期："
				+this.releaseDate+"\n歌手"+this.singer;
	}

}
