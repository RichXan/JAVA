package first;

import java.util.Scanner;

public class definite_integral {

	public static void main(String[]args) {
		int i=1;
		float sum=0;
		Scanner scanner= new Scanner(System.in);

		System.out.print("�������������a��");
		float a = scanner.nextFloat();			//��������a
		System.out.print("�������������b��");
		float b = scanner.nextFloat();			//��������b
		System.out.print("������ָ����n��");
		int n = scanner.nextInt();			//�ָ����n
		
		float x = (a+((b-a)/n)*i);
		float y = x * x;
		for(;i<n;i++) {
			sum=sum + y*((b-a)/n);
		}
		System.out.println(sum);
	}

}
