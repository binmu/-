package homework8_01;

import java.util.TreeSet;

/**
 * ֪ʶ����ϰ������TreeSet������¹��ܣ���һ��
 * �ַ�����13��5,2,17,9��ת��Ϊ��9��5,2,17,13���������
 * @author binlin
 *
 */
public class TreeSetTest {

	public static void main(String[] args) {
		String str = "13,5,2,17,9";
		String[] str1 = str.split(",");
		TreeSet<String> ts = new TreeSet<String>(new Sort<String>());
		for(int index=0;index<str1.length;index++) {
			ts.add(str1[index]);
		}
		System.out.println(ts);
	}
}
