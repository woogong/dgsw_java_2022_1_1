package kr.hs.dgsw.java.dept1.d0420;

public class Tiger extends Mammal {
	
	public void makeSound() {
		System.out.println("�߿�");
	}
	
	@Override
	public void birth() {
		System.out.println("ȣ���̰� ������ ������ �����ϴ�.");
	}

	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		tiger.move();
		tiger.birth();
		tiger.makeSound();
		
		Mammal tiger2 = new Tiger();
		tiger2.move();
		tiger2.birth();
		//tiger2.makeSound();
		
		//String abc = new Tiger();
		
	}
	
}
