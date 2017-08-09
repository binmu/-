package homework8_4.one;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Store {
    //���ơ�Ʒ�ơ�����
	HashMap<Integer,Product> pro = new HashMap<Integer,Product>();
	public Store() {
		pro.put(0, new Product("����","����",10));
		pro.put(1, new Product("���","����",20));
		pro.put(2, new Product("����","����",100));
		pro.put(3, new Product("��̳���ţ����","ͳһ",1000));
		pro.put(4, new Product("�ع���","�Ĵ�",300));
		pro.put(5, new Product("������","���",90));
		pro.put(6, new Product("����","����",80));
		pro.put(7, new Product("������","�Ĵ�",90));
		pro.put(8, new Product("java","NIIT",400));
		pro.put(9, new Product("���","����",350));
	}
	
	/**
	 * ͬһ��Ʒ�Ƹ����ж���С��Ʒ��
	 * @return
	 */
	public Map<String, Integer> getProductByPinpai(){
		Set<Entry<Integer,Product>> entrys = pro.entrySet();
		Map<String, Integer>  map = new HashMap<>();
		Iterator<Entry<Integer, Product>> itEntry = entrys.iterator();
		while(itEntry.hasNext()){	//����
			Entry<Integer, Product> tmpEtr = itEntry.next();
			String str = tmpEtr.getValue().pinpai;  //��¼����Ʒ��Ʒ��
			//System.out.println(str);
			//System.out.println(map.containsKey(str));
			if(map.containsKey(str)) {  //���ͬ��Ʒ�Ƶ���Ʒ���ͼ�һ
				map.put(str, map.get(str).intValue() + 1);
			}else {
				map.put(str,1); //û�ҵ���ͬƷ�Ƶ���Ʒ���½�һ��������װ��
			}
		}
		return map;
	}
	
	/**
	 * ͨ��Ʒ������Ʒ
	 * @param pinpai
	 * @return
	 */
	public Map<Integer, Product> getProductByPinpai(String pinpai){
		Set<Entry<Integer,Product>> entrys = pro.entrySet();
		Map<Integer,Product>  map = new HashMap<>();
		Iterator<Entry<Integer, Product>> itEntry = entrys.iterator();
		int i = 0;
		while(itEntry.hasNext()){	//����
			Entry<Integer, Product> tmpEtr = itEntry.next();
			if(tmpEtr.getValue().pinpai.equals(pinpai)) {  //���ͬ��Ʒ�Ƶ���Ʒ���ͼ�һ
				map.put(i, tmpEtr.getValue());
				i++;
				//System.out.println(map.toString());
			}
		}
		return map;
	}
	
	/**
	 * ��������500����Ʒ������һ����Ʒֻ��1����
	 * @return
	 */
	public Map<Integer, Product> getProductByUnder500Price(){
		Set<Entry<Integer,Product>> entrys = pro.entrySet();
		Map<Integer, Product>  map = new HashMap<>();
		Iterator<Entry<Integer, Product>> itEntry = entrys.iterator();
		while(itEntry.hasNext()){	
			Entry<Integer, Product> tmpEtr = itEntry.next();
			if(tmpEtr.getValue().price < 500) {
				map.put(tmpEtr.getKey(),tmpEtr.getValue());
			}
		}
		return map;
		
	}
}
