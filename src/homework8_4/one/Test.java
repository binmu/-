package homework8_4.one;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Store store = new Store();
		System.out.println(store.getProductByUnder500Price().values().toString());
		System.out.println(store.getProductByPinpai().toString());
		System.out.println("������Ҫ��ѯ��Ʒ�ƣ�");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(store.getProductByPinpai(str).values().toString());
	}
}
