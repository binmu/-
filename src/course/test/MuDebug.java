package course.test;

import java.util.Random;

public class MuDebug {

	public int getNumber() {
		Random r = new Random();
		int x = r.nextInt(100);
		return x;
	}
	
	public static void main(String[] args) {
		
		MuDebug dd = new MuDebug();
		int d = dd.getNumber();
		System.out.println(d);
		if(d<60) {
			System.out.println("buhege");
		}else {
			System.out.println("hege");
		}
	}
}
