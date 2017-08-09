package course.test;

//----Collection:单列集合

//--------List:有序 可重复
//------------ArrayList:可变长度的数组，查询速度飞快，不适合频繁的增删，线程不同步，存取效率高
//------------LinkedList:可变长度的链表，增删速度飞快，查询速度较慢
//------------Vector:(了解)原理和ArrayList更相似，他们都是使用一个可变长度的对象数组来作为操作数组，线程同步的，存取效率低很多
//------------实际应用场合中，Vector应用较少，除非多线程场景；根据查询的操作频率是否高，如果高就选择ArrayList，如果很低，就选择LinkedList
//--------Set:无序（插入顺序和排放顺序不一致） 不可重复
//------------HashSet:原理是个哈希表，存取速度是最快的（哈希表算法没有使用随机数，是个固定算法；一旦有了顺序，顺序一般不变化）
//------------TreeSet:树的集合，二叉树（最基本也是最常用，这和我们boolean相似）
import java.util.TreeSet;
public class TreeSetTest {
	public static void main(String[] args) {	
		//A.使用了最基本的用法--添加元素String+简单展示toString
		//体验Set的两大特点：无序和不可重复
//		TreeSet ts = new TreeSet();
		//如果插入树形集合的话，那么对于字符串这种常见的类型，是按照字符串正常比较的顺序来进行顺序，也就是拼音的英文排序
//		ts.add("王小二");
//		ts.add("赵小四");
//		ts.add("李小五");
//		ts.add("李小五");
//		System.out.println(ts);
		
		
		
		
		//1.报出异常：ClassCastException:Student cannot be cast to java.lang.Comparable
		//TreeSet本身的比较器没有赋值，所以要求所有加入TreeSet的元素都应该拥有的比较的功能
		//学生类无法转换为Comparable接口
		//2.Student实现接口：要用接口，是因为TreeSet的要求；要用接口，不是用接口本身，而是用他的子类对象
		//了解：
		//3.接口如何实现：compareTo:-1小于 0等于 1大于
		//int也是如此 compare（比较对象1，比较对象2）
//		 final int compare(Object k1, Object k2) {
//		 this.comparator==null TreeMap可以拥有比较的属性（比较器）
//		 true:没有比较器，该类型的对象就应该自带比较器，然后依据自带的比较器，来得出我们的比较结果
//		 false:有比较器，将两个比较对象放在比较器上来比一下
//         return comparator==null ? ((Comparable<? super K>)k1).compareTo((K)k2)
//            : comparator.compare((K)k1, (K)k2);
//		 }
		//B.了解插入TreeSet的元素的基本要求和方式
		//TreeSet中要插入的元素要符合以下两个条件之一：
		//插入元素1.自身元素自带比较的属性，例如String、int
		//插入元素2.这些对象自定义了比较的属性，例如实现了Comparable接口
		//注意事项3.元素是否重复，是否可以插入到TreeSet，是由我们的compareTo的方法返回值是否等于0来决定的（HashCode() equals()）
		//插入元素3.如果自身元素没有自带比较的属性，也没有自定义比较的属性，那么TreeSet可以默认提供一个比较的属性
		//如果自身元素已经自定义比较的属性，然后TreeSet可以默认提供一个比较的属性，那么元素的比较究竟是按照TreeSet的还是按照自身属性来
		//1.测试我的问题，给出我答案
		//2.为什么？
		//3.把刚才这么多内容简单复习下
		TreeSet ts = new TreeSet(new MyCompare());		
		Student stuOne = new Student();
		stuOne.stuNo = "2017001";
		stuOne.name = "王二子";
		Student stuTwo = new Student();
		stuTwo.stuNo = "2017002";
		stuTwo.name = "王五子";
		Student stuThree = new Student();
		stuThree.stuNo = "2017003";
		stuThree.name = "赵四儿";
		Student stuFour = new Student();
		stuFour.stuNo = "2017003";
		stuFour.name = "赵五儿";
		ts.add(stuOne);
		ts.add(stuTwo);
		ts.add(stuThree);
		ts.add(stuFour);
		System.out.println(ts);
		
		//Question1:之前是按照学生姓名来作为比较的因素，现在要求换成学号，因为学号才是花名册打印的首要因素
		//compareTo中比较部分的代码
		//Question2:之前是学号来进行比较，然后从小到大打印的，现在倒序，从大到小打印
		//compareTo中比较部分的代码
		//Question3:字符串究竟是如何比较的,将字符串相同位置的字符拿出来依次进行比较，直到出现不同为止，此时不同的字符的大小就决定着整个字符串的大小
		//如果其中的一个字符串已经比较完毕了，还没有发现不同，那么就比较字符串长度，谁长谁大
		//"abc"  "abccccc"
//		String testOne = new String("abc");		
//		String testTwo = new String("abccccc");
//		String testOne = new String("210");
//		String testTwo = new String("22");
//		System.out.println(testOne.compareTo(testTwo));
		//Question4:现在有两个学生，学号相同，名字不同，在TreeSet比较谁大
//		Student stuOne = new Student();
//		stuOne.stuNo = "2017001";
//		stuOne.name = "王二子";
//		Student stuTwo = new Student();
//		stuTwo.stuNo = "2017002";
//		stuTwo.name = "王五子";
//		Student stuThree = new Student();
//		stuThree.stuNo = "2017003";
//		stuThree.name = "赵四儿";
//		Student[] stus = new Student[3];
//		stus[0] = stuThree;
//		stus[1] = stuTwo;
//		stus[2] = stuOne;
//		
//		TreeSetTest tst = new TreeSetTest();
//		tst.sortStudents(stus);
//		for(int index = 0; index<stus.length;index++){
//			System.out.println(stus[index]);
//		}
	}
	
	//排序：面试常考的算法
	//淘宝里面有个功能：已买过的物品，删除订单，存档，很多表面看上去是删除的操作，其实背后都是修改
	//比较是排序的基础；排序是查询的基础；查询同时还是修改/删除的基础；查询其实也是新增的基础，因为新增到一个有序部分，要查找到新增的位置
	//是否需要返回值：有进有出，改变参数，主调方法是能够体会到的，因为引用类型的对象时地址传递的，更何况是对象数组
	public void sortStudents(Student[] stus){
		for(int index = 0; index<stus.length-1;index++){
			for(int comIndex = stus.length-1;comIndex >index;comIndex--){
				//if(stus[comIndex].stuNo.compareTo(stus[comIndex-1].stuNo) < 0){
				if(!(stus[comIndex].stuNo.compareTo(stus[comIndex-1].stuNo) < 0)){
				//if(-1*stus[comIndex].stuNo.compareTo(stus[comIndex-1].stuNo) < 0){
				//if(stus[comIndex].stuNo.compareTo(stus[comIndex-1].stuNo) > 0){
					Student tmpStu = stus[comIndex-1];
					stus[comIndex-1] = stus[comIndex];
					stus[comIndex] = tmpStu;
				}
			}
		}
	}
}
