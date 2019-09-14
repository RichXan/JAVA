package first;

import java.util.Scanner;

public class definite_integral {

	public static void main(String[]args) {
		int i=1;
		float sum=0;
		Scanner scanner= new Scanner(System.in);

		System.out.print("请输入积分下限a：");
		float a = scanner.nextFloat();			//积分下限a
		System.out.print("请输入积分上限b：");
		float b = scanner.nextFloat();			//积分上限b
		System.out.print("请输入分割份数n：");
		int n = scanner.nextInt();			//分割份数n
		
		float x = (a+((b-a)/n)*i);
		float y = x * x;
		for(;i<n;i++) {
			sum=sum + y*((b-a)/n);
		}
		System.out.println(sum);
	}

}
