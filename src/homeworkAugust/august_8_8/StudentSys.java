package homeworkAugust.august_8_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 随机生成5个学生的分数，并按分数从小到大排序，如果分数一样按学号排
 */
public class StudentSys {

    List<Student> list = new ArrayList<>();

    public StudentSys() {
        list.add(new Student("No.1","小明","男"));
        list.add(new Student("No.2","二明","男"));
        list.add(new Student("No.3","大明","女"));
        list.add(new Student("No.4","中明","男"));
        list.add(new Student("No.5","一明","女"));
        this.randomScore();
    }

    public void randomScore(){
    	Iterator<Student> it = list.iterator();
    	while(it.hasNext()) {
    		Student tempStu = it.next();
    		Random rand = new Random();
    		double num = rand.nextDouble()*100;
    		num = (int)(num*10)/10.0;
    		tempStu.setScore(num);
    	}
    }
    
    public void sortStudentByScoreOrId(){
    	Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				double i =  o1.getScore() - o2.getScore();
				if(i<0) {
					return -1;
				}else if(i==0) {
					System.out.println(o1.getId().compareTo(o2.getId()));
					return o1.getId().compareTo(o2.getId());
				}else {
					return 1;
				}
			}
		});
    	Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
     }
}

