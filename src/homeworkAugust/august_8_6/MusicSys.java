package homeworkAugust.august_8_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * TreeMap���԰��ո������ơ�ʱ���ͷ��������������ʵ�����
 * ͳ��ĳλ���ֹ��������ٵ���
 * @author student
 *
 */
public class MusicSys {

	TreeMap<Music,Singer> musicsys;
	ArrayList<Music> music = new ArrayList<>();
	ArrayList<Singer> singer = new ArrayList<>();
	TreeMap<Integer,Music> musicOne = new TreeMap<>();

	public MusicSys() {
		music.add(0, new Music("�ҵĻ���Ь","3����","20170806"));
		music.add(1, new Music("Сƻ��","4����","20170808"));
		music.add(2, new Music("����֮��","5����","20150806"));
		music.add(3, new Music("����ĺ���","6����","20150805"));
		
		singer.add(0, new Singer("������",'��',"zz"));
		singer.add(1, new Singer("�����ֵ�",'��',"���"));
		singer.add(2, new Singer("��˴���",'��',"���"));
		
		music.get(0).setSinger(singer.get(0));
		music.get(1).setSinger(singer.get(1));
		music.get(2).setSinger(singer.get(2));
		music.get(3).setSinger(singer.get(2));
		
		musicOne.put(0, music.get(0));
		musicOne.put(1, music.get(1));
		musicOne.put(2, music.get(2));
		musicOne.put(3, music.get(3));
	}
	
	private void iniTreeMapData(TreeMap<Music,Singer> treeMap) {
		treeMap.put(music.get(0), singer.get(0));
		treeMap.put(music.get(1), singer.get(1));
		treeMap.put(music.get(2), singer.get(2));
		treeMap.put(music.get(3), singer.get(2));
	}
	
	public void sortByMusicName() {
		musicsys = new TreeMap<>(new MyCompareByMusicName());
		iniTreeMapData(musicsys);
		show(musicsys);
		
//		MyCompareByMusicName one = new MyCompareByMusicName();
//		one.compare(o1, o2)
	}
	
	public void sortByMusicDuration() {
		musicsys = new TreeMap<>(new MyCompareByMusicDuration());
		iniTreeMapData(musicsys);
		show(musicsys);
	}
	
	public void sortByMusicReleaseDate() {
		musicsys = new TreeMap<>(new MyCompareByMusicReleaseDate());
		iniTreeMapData(musicsys);
		show(musicsys);
	}
	
	public ArrayList<Music> countSingerMusics(String name) {
		Set<Entry<Integer, Music>> entries = musicOne.entrySet();
		Iterator<Entry<Integer, Music>> it = entries.iterator();
		ArrayList<Music> tmpArray = new ArrayList<>();
		while(it.hasNext()){
			Entry<Integer, Music> tmpEntry = it.next();
			Music tmpMusic = tmpEntry.getValue();
			if(tmpMusic.getSinger().getName().equals(name)) {
				tmpArray.add(tmpMusic);
			}
		}
		return tmpArray;
	}
	
	private void show(TreeMap<Music,Singer> treeMap) {
		Set<Entry<Music,Singer>> entries = treeMap.entrySet();
		Iterator<Entry<Music,Singer>> it = entries.iterator();
		while(it.hasNext()){
			Entry<Music,Singer> tmpEntry = it.next();
			Music tmpMusic = tmpEntry.getKey();
			System.out.println(tmpMusic.toString());
			System.out.println("####################");
		}
	}
}
