package kr.hs.dgsw.java.dept1.d0518;

import java.io.IOException;

public class MyClass {

	public void method1()  throws MyException, IOException  {
		System.out.println("method1 ȣ���");
		method2();
		
		ArithmeticException e = new ArithmeticException();
		throw e;
	}

	public void method2() throws MyException, IOException  {
		System.out.println("method2 ȣ���");
		method3();
		
		IOException e = new IOException();
		throw e;
		
		
	}

	public void method3() throws MyException {
		System.out.println("method3 ȣ���");
		
		// ���ܸ� ���� �߻���ŵ�ϴ�.
		MyException e = new MyException();
		throw e;
	}

	public static void main(String[] args) {
		try {
			MyClass myClass = new MyClass();
			myClass.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
