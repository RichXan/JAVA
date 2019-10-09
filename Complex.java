package first;

import java.io.InputStream;
import java.util.Scanner;

public class Complex {
	double real;
	double image;

	Complex(){
		Scanner scan = Scanner(System.in);
		double real = scan.nextDouble();
		double image = scan.nextDouble();
		Complex(real,image);
	}
	private Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
	private void Complex(double real, double image) {
		// TODO Auto-generated method stub
		this.real = real;
		this.image = image;
	}


	Complex(double real,double image){
		this.real=real;
		this.image=image;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImage() {
		return image;
	}
	public void SetImage(double image) {
		this.image= image;
	}
	
	//ADD
	Complex add(Complex a) {
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real + real2;
		double newImage = image + image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}
	//SUBSTRATION
	Complex sub(Complex a){ 
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real - real2;
		double newImage = image - image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}
	//multipltion
	Complex mul(Complex a){ 
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = real*real2 - image*image2;
		double newImage = image*real2 + real*image2;
		Complex result = new Complex(newReal,newImage);
		return result;
	}
	//division
	Complex div(Complex a){ // 复数相除
		double real2 = a.getReal();
		double image2 = a.getImage();
		double newReal = (real*real2 + image*image2)/(real2*real2 + image2*image2);
		double newImage = (image*real2 - real*image2)/(real2*real2 + image2*image2);
		Complex result = new Complex(newReal,newImage);
		return result;
	}	
	public void print(){ // 输出
		if(image > 0){
			System.out.println(real + " + " + image + "i");
		}else if(image < 0){
			System.out.println(real + "" + image + "i");
		}else{
			System.out.println(real);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请用户输入第一个复数的实部和虚部:");
        Complex data1 = new Complex();
        System.out.println("请用户输入第二个复数的实部和虚部:");
        Complex data2 = new Complex();
       
        // 以下分别为加减乘除
        Complex result_add = data1.add(data2);
        Complex result_sub = data1.sub(data2);
        Complex result_mul = data1.mul(data2);
        Complex result_div = data1.div(data2);
        
        result_add.print();
        result_sub.print();
        result_mul.print();
        result_div.print();
	}


}

