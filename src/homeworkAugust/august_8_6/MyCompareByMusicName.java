package homeworkAugust.august_8_6;

import java.util.Comparator;

public class MyCompareByMusicName implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
