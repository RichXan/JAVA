//ר�����䳵
public class Ztransportation extends Transportation implements Careable{
	//�޲ι���
	public Ztransportation() {
		super();
	}
	//�вι��죺������š��ͺš�������
	public Ztransportation(String number,String mode,String admin) {
		super(number,mode,admin);
	}
	//���䷽��
	public void transport() {
		System.out.println("�����С�����");
	}
	//��д������������
	public void upKeep() {
		System.out.println("�������䳵��������ϣ�");
	}
}
