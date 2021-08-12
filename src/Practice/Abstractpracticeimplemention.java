package Practice;

import org.apache.xalan.xsltc.compiler.sym;

public class Abstractpracticeimplemention implements Abstractpractice
{
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is method 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstractpractice i = new Abstractpracticeimplemention();
i.method1();
i.method2();


	}

	

}
