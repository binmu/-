package homework8_0102;

import java.util.ArrayList;

/**
 * ֪ʶ����ϰ�����÷�����ʵ�����¹��ܣ��÷�������Ҫ�������¹��ܣ�
 * 1.�������飬���Ե����ӡ��
 * 2.�������飬���ԴӴ�С������������
 * 3.�������飬�õ�����Ԫ��
 * 4.�������飬�õ���С��Ԫ�ء������Է����ʹ������ڲ���
 * @author student
 *
 */
public class Test {

	public static void main(String[] args) {
		Integer[] aa = {5,9,7,8,6};
		ArrayTest<Integer> arrOne = new ArrayTest<Integer>();
		ArrayList<Integer> arr1 = arrOne.sort(aa);
		System.out.println(arr1);
		ArrayList<Integer> arr2 = arrOne.reverse(aa);
		System.out.println(arr2);
		System.out.println("���ֵ��"+arr1.get(0));
		System.out.println("��Сֵ��"+arr1.get(arr1.size()-1));
		
		String[] str = "a,ab,abc,abcf,abce".split(",");
		ArrayTest<String> arrTwo = new ArrayTest<String>();
		ArrayList<String> arr3 = arrTwo.sort(str);
		System.out.println(arr3);
		ArrayList<String> arr4 = arrTwo.reverse(str);
		System.out.println(arr4);
		System.out.println("���ֵ��"+arr3.get(0));
		System.out.println("��Сֵ��"+arr3.get(arr3.size()-1));
	}
}
