package homework8_4.one;

/**
 * value�������ǵ�С��Ʒ�����ơ�Ʒ�ơ����ۣ�
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
		return "\n����:"+this.name+"\nƷ��:"+this.pinpai+"\n����:"+this.price+"Ԫ\n";
	}
}
