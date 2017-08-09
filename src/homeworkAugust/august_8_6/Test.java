package homeworkAugust.august_8_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		MusicSys musicOne = new MusicSys();
		//musicOne.sortByMusicName();
		//musicOne.sortByMusicDuration();
		musicOne.sortByMusicReleaseDate();
		
		ArrayList<Music> arrayOne = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入查询歌手的名字：");
		String str = sc.next();
		arrayOne = musicOne.countSingerMusics(str);
		System.out.println(str+"共发布"+arrayOne.size()+"首单曲！");
	}
}
