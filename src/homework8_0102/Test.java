package homework8_0102;

import java.util.ArrayList;

/**
 * 知识点练习：利用泛型类实现以下功能，该泛型类需要具有以下功能：
 * 1.传入数组，可以倒序打印；
 * 2.传入数组，可以从大到小依次正序排列
 * 3.传入数组，得到最大的元素
 * 4.传入数组，得到最小的元素。做测试方法和代码用于测试
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
		System.out.println("最大值："+arr1.get(0));
		System.out.println("最小值："+arr1.get(arr1.size()-1));
		
		String[] str = "a,ab,abc,abcf,abce".split(",");
		ArrayTest<String> arrTwo = new ArrayTest<String>();
		ArrayList<String> arr3 = arrTwo.sort(str);
		System.out.println(arr3);
		ArrayList<String> arr4 = arrTwo.reverse(str);
		System.out.println(arr4);
		System.out.println("最大值："+arr3.get(0));
		System.out.println("最小值："+arr3.get(arr3.size()-1));
	}
}
