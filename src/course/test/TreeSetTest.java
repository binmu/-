package course.test;

//----Collection:���м���

//--------List:���� ���ظ�
//------------ArrayList:�ɱ䳤�ȵ����飬��ѯ�ٶȷɿ죬���ʺ�Ƶ������ɾ���̲߳�ͬ������ȡЧ�ʸ�
//------------LinkedList:�ɱ䳤�ȵ�������ɾ�ٶȷɿ죬��ѯ�ٶȽ���
//------------Vector:(�˽�)ԭ���ArrayList�����ƣ����Ƕ���ʹ��һ���ɱ䳤�ȵĶ�����������Ϊ�������飬�߳�ͬ���ģ���ȡЧ�ʵͺܶ�
//------------ʵ��Ӧ�ó����У�VectorӦ�ý��٣����Ƕ��̳߳��������ݲ�ѯ�Ĳ���Ƶ���Ƿ�ߣ�����߾�ѡ��ArrayList������ܵͣ���ѡ��LinkedList
//--------Set:���򣨲���˳����ŷ�˳��һ�£� �����ظ�
//------------HashSet:ԭ���Ǹ���ϣ����ȡ�ٶ������ģ���ϣ���㷨û��ʹ����������Ǹ��̶��㷨��һ������˳��˳��һ�㲻�仯��
//------------TreeSet:���ļ��ϣ��������������Ҳ����ã��������boolean���ƣ�
import java.util.TreeSet;
public class TreeSetTest {
	public static void main(String[] args) {	
		//A.ʹ������������÷�--���Ԫ��String+��չʾtoString
		//����Set�������ص㣺����Ͳ����ظ�
//		TreeSet ts = new TreeSet();
		//����������μ��ϵĻ�����ô�����ַ������ֳ��������ͣ��ǰ����ַ��������Ƚϵ�˳��������˳��Ҳ����ƴ����Ӣ������
//		ts.add("��С��");
//		ts.add("��С��");
//		ts.add("��С��");
//		ts.add("��С��");
//		System.out.println(ts);
		
		
		
		
		//1.�����쳣��ClassCastException:Student cannot be cast to java.lang.Comparable
		//TreeSet����ıȽ���û�и�ֵ������Ҫ�����м���TreeSet��Ԫ�ض�Ӧ��ӵ�еıȽϵĹ���
		//ѧ�����޷�ת��ΪComparable�ӿ�
		//2.Studentʵ�ֽӿڣ�Ҫ�ýӿڣ�����ΪTreeSet��Ҫ��Ҫ�ýӿڣ������ýӿڱ��������������������
		//�˽⣺
		//3.�ӿ����ʵ�֣�compareTo:-1С�� 0���� 1����
		//intҲ����� compare���Ƚ϶���1���Ƚ϶���2��
//		 final int compare(Object k1, Object k2) {
//		 this.comparator==null TreeMap����ӵ�бȽϵ����ԣ��Ƚ�����
//		 true:û�бȽ����������͵Ķ����Ӧ���Դ��Ƚ�����Ȼ�������Դ��ıȽ��������ó����ǵıȽϽ��
//		 false:�бȽ������������Ƚ϶�����ڱȽ���������һ��
//         return comparator==null ? ((Comparable<? super K>)k1).compareTo((K)k2)
//            : comparator.compare((K)k1, (K)k2);
//		 }
		//B.�˽����TreeSet��Ԫ�صĻ���Ҫ��ͷ�ʽ
		//TreeSet��Ҫ�����Ԫ��Ҫ����������������֮һ��
		//����Ԫ��1.����Ԫ���Դ��Ƚϵ����ԣ�����String��int
		//����Ԫ��2.��Щ�����Զ����˱Ƚϵ����ԣ�����ʵ����Comparable�ӿ�
		//ע������3.Ԫ���Ƿ��ظ����Ƿ���Բ��뵽TreeSet���������ǵ�compareTo�ķ�������ֵ�Ƿ����0�������ģ�HashCode() equals()��
		//����Ԫ��3.�������Ԫ��û���Դ��Ƚϵ����ԣ�Ҳû���Զ���Ƚϵ����ԣ���ôTreeSet����Ĭ���ṩһ���Ƚϵ�����
		//�������Ԫ���Ѿ��Զ���Ƚϵ����ԣ�Ȼ��TreeSet����Ĭ���ṩһ���Ƚϵ����ԣ���ôԪ�صıȽϾ����ǰ���TreeSet�Ļ��ǰ�������������
		//1.�����ҵ����⣬�����Ҵ�
		//2.Ϊʲô��
		//3.�Ѹղ���ô�����ݼ򵥸�ϰ��
		TreeSet ts = new TreeSet(new MyCompare());		
		Student stuOne = new Student();
		stuOne.stuNo = "2017001";
		stuOne.name = "������";
		Student stuTwo = new Student();
		stuTwo.stuNo = "2017002";
		stuTwo.name = "������";
		Student stuThree = new Student();
		stuThree.stuNo = "2017003";
		stuThree.name = "���Ķ�";
		Student stuFour = new Student();
		stuFour.stuNo = "2017003";
		stuFour.name = "�����";
		ts.add(stuOne);
		ts.add(stuTwo);
		ts.add(stuThree);
		ts.add(stuFour);
		System.out.println(ts);
		
		//Question1:֮ǰ�ǰ���ѧ����������Ϊ�Ƚϵ����أ�����Ҫ�󻻳�ѧ�ţ���Ϊѧ�Ų��ǻ������ӡ����Ҫ����
		//compareTo�бȽϲ��ֵĴ���
		//Question2:֮ǰ��ѧ�������бȽϣ�Ȼ���С�����ӡ�ģ����ڵ��򣬴Ӵ�С��ӡ
		//compareTo�бȽϲ��ֵĴ���
		//Question3:�ַ�����������αȽϵ�,���ַ�����ͬλ�õ��ַ��ó������ν��бȽϣ�ֱ�����ֲ�ͬΪֹ����ʱ��ͬ���ַ��Ĵ�С�;����������ַ����Ĵ�С
		//������е�һ���ַ����Ѿ��Ƚ�����ˣ���û�з��ֲ�ͬ����ô�ͱȽ��ַ������ȣ�˭��˭��
		//"abc"  "abccccc"
//		String testOne = new String("abc");		
//		String testTwo = new String("abccccc");
//		String testOne = new String("210");
//		String testTwo = new String("22");
//		System.out.println(testOne.compareTo(testTwo));
		//Question4:����������ѧ����ѧ����ͬ�����ֲ�ͬ����TreeSet�Ƚ�˭��
//		Student stuOne = new Student();
//		stuOne.stuNo = "2017001";
//		stuOne.name = "������";
//		Student stuTwo = new Student();
//		stuTwo.stuNo = "2017002";
//		stuTwo.name = "������";
//		Student stuThree = new Student();
//		stuThree.stuNo = "2017003";
//		stuThree.name = "���Ķ�";
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
	
	//�������Գ������㷨
	//�Ա������и����ܣ����������Ʒ��ɾ���������浵���ܶ���濴��ȥ��ɾ���Ĳ�������ʵ�������޸�
	//�Ƚ�������Ļ����������ǲ�ѯ�Ļ�������ѯͬʱ�����޸�/ɾ���Ļ�������ѯ��ʵҲ�������Ļ�������Ϊ������һ�����򲿷֣�Ҫ���ҵ�������λ��
	//�Ƿ���Ҫ����ֵ���н��г����ı�����������������ܹ���ᵽ�ģ���Ϊ�������͵Ķ���ʱ��ַ���ݵģ����ο��Ƕ�������
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
