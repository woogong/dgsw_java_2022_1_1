package kr.hs.dgsw.java.dept1.d0504;

public class Person implements Printer {
	protected String name;
	
	public void sayHello() {
		System.out.println(name + "�� �ȳ��ϼ���.");
	}
	
	@Override
	public void print() {
		System.out.println("���� �̸��� " + name + "�Դϴ�.");
	}
	
	@Override
	public void print(String value) {
		this.print();
		System.out.println("���� ģ���� �̸��� " + value + "�Դϴ�.");
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "���缮";
		person.sayHello();
		person.print();
		person.print("��ȣ��");
		
		Printer person1 = new Person();
		//person1.name = "��ȿ��";
		//person1.sayHello();
		person1.print();
		person1.print("������");
	}
	
}





