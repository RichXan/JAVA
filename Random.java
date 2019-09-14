package first;

import java.util.Random;

public class Random {
	public static void main (String[] args) {
		String [] Number = new String[] {"1","12","123","1234","12345","123456","1234567",
				"12345678","123456789","1234567890"};
		String [] job = new String[] {"teacher","student","professor","docotor","nuser",
				"player","engineer","singer","boss"};
		String [] name = new String[] {"LiaoXueFeng","Zhong","Yanghesu","eason","Jack Chen",
				"RichXan","Bulux","Woin"};
		int x=(int)(Math.random()*10);
		int y=(int)(Math.random()*9);
		int z=(int)(Math.random()*8);
		String Sum = Number[x] + job [y] + name [z];
		System.out.println(Sum);
		System.out.println(Sum.length());
	}
}
