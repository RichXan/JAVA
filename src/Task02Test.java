
public class Task02Test {
	public static void main(String[] args) {
		SendTask task = new SendTask("HYX600235",76.34);
		task.sendBefore();
		System.out.println("==============");
		Ztransportation t = new Ztransportation("Z025","´ó±¼","Ð¡º«");
		Phone p = new Phone();
		task.send(t,p);
		System.out.println("==============");
		task.sendAfter(t);
		t.upKeep();
	}
}
