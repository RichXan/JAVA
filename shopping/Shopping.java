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
		p2.setProName("ϴ�»�");
		p3.setProName("������");
		p4.setProName("�յ���");
		p5.setProName("�����");
		Market m = new Market();
		m.setMarketName("���ָ�");
		m.setproductArr(new Product[] {p1,p2,p3,p4,p5});
		Person p = new Person();
		p.setName("xiaohan");
		Product result = p.Shopping(m,"������");

		if(result != null) {
			System.out.println(p.getName()+"��"
								+ m.getMarketName()+"����"
								+ result.getProName());
		}else {
			System.out.print(p.getName() + "����һ�ˣ���"
							+ m.getMarketName() + "ʲôҲû��");
		}
		
	}

}
