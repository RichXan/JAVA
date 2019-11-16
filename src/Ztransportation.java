//专用运输车
public class Ztransportation extends Transportation implements Careable{
	//无参构造
	public Ztransportation() {
		super();
	}
	//有参构造：车辆编号、型号、负责人
	public Ztransportation(String number,String mode,String admin) {
		super(number,mode,admin);
	}
	//运输方法
	public void transport() {
		System.out.println("运输中。。。");
	}
	//重写车辆保养方法
	public void upKeep() {
		System.out.println("货物运输车俩保养完毕！");
	}
}
