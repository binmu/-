package homework8_4.one;

/**
 * value就是我们的小商品（名称、品牌、单价）
 * @author student
 *
 */
public class Product {

	public String name;
	public String pinpai;
	public int price;
	
	public Product() {

	}

	public Product(String name, String pinpai, int price) {
		super();
		this.name = name;
		this.pinpai = pinpai;
		this.price = price;
	}
	
	public String toString() {
		return "\n名称:"+this.name+"\n品牌:"+this.pinpai+"\n单价:"+this.price+"元\n";
	}
}
