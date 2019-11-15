package shopping;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		p1.setProName("Tv");
		p2.setProName("洗衣机");
		p3.setProName("豆浆机");
		p4.setProName("空调机");
		p5.setProName("吹风机");
		Market m = new Market();
		m.setMarketName("家乐福");
		m.setproductArr(new Product[] {p1,p2,p3,p4,p5});
		Person p = new Person();
		p.setName("xiaohan");
		Product result = p.Shopping(m,"豆浆机");

		if(result != null) {
			System.out.println(p.getName()+"在"
								+ m.getMarketName()+"买到了"
								+ result.getProName());
		}else {
			System.out.print(p.getName() + "白跑一趟，在"
							+ m.getMarketName() + "什么也没买到");
		}
		
	}

}
