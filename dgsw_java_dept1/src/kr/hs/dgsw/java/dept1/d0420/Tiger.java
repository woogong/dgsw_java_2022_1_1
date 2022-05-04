package kr.hs.dgsw.java.dept1.d0420;

public class Tiger extends Mammal {
	
	public void makeSound() {
		System.out.println("¾ß¿Ë");
	}
	
	@Override
	public void birth() {
		System.out.println("È£¶ûÀÌ°¡ ¹«¼­¿î »õ³¢¸¦ ³º½À´Ï´Ù.");
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
