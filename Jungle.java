package first;

public class Jungle {
	public static void main(String[]args) {
		float endHp =5;
		float beginHp= 0;
		for (int i = 1;i<6;i++) {
			beginHp = endHp / 2;
			endHp = beginHp;
		}
		System.out.println("The Hp is "+ beginHp +"at begin");
	}
}
