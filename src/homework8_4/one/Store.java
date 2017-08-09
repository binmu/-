package homework8_4.one;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Store {
    //名称、品牌、单价
	HashMap<Integer,Product> pro = new HashMap<Integer,Product>();
	public Store() {
		pro.put(0, new Product("辣条","卫龙",10));
		pro.put(1, new Product("面筋","卫龙",20));
		pro.put(2, new Product("火鸡面","龙卫",100));
		pro.put(3, new Product("老坛酸菜牛肉面","统一",1000));
		pro.put(4, new Product("回锅肉","四川",300));
		pro.put(5, new Product("狗不理","天津",90));
		pro.put(6, new Product("薯条","卫龙",80));
		pro.put(7, new Product("辣椒粉","四川",90));
		pro.put(8, new Product("java","NIIT",400));
		pro.put(9, new Product("面包","包面",350));
	}
	
	/**
	 * 同一个品牌各自有多少小商品；
	 * @return
	 */
	public Map<String, Integer> getProductByPinpai(){
		Set<Entry<Integer,Product>> entrys = pro.entrySet();
		Map<String, Integer>  map = new HashMap<>();
		Iterator<Entry<Integer, Product>> itEntry = entrys.iterator();
		while(itEntry.hasNext()){	//遍历
			Entry<Integer, Product> tmpEtr = itEntry.next();
			String str = tmpEtr.getValue().pinpai;  //记录下商品的品牌
			//System.out.println(str);
			//System.out.println(map.containsKey(str));
			if(map.containsKey(str)) {  //如果同种品牌的商品，就加一
				map.put(str, map.get(str).intValue() + 1);
			}else {
				map.put(str,1); //没找到相同品牌的商品就新建一个容器来装下
			}
		}
		return map;
	}
	
	/**
	 * 通过品牌找商品
	 * @param pinpai
	 * @return
	 */
	public Map<Integer, Product> getProductByPinpai(String pinpai){
		Set<Entry<Integer,Product>> entrys = pro.entrySet();
		Map<Integer,Product>  map = new HashMap<>();
		Iterator<Entry<Integer, Product>> itEntry = entrys.iterator();
		int i = 0;
		while(itEntry.hasNext()){	//遍历
			Entry<Integer, Product> tmpEtr = itEntry.next();
			if(tmpEtr.getValue().pinpai.equals(pinpai)) {  //如果同种品牌的商品，就加一
				map.put(i, tmpEtr.getValue());
				i++;
				//System.out.println(map.toString());
			}
		}
		return map;
	}
	
	/**
	 * 单价少于500的商品（假设一种商品只有1件）
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
