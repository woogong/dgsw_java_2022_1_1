package kr.hs.dgsw.java.dept1.d0427;

public abstract class Animal {
	
	public abstract String getName();
	
	public abstract String makeSound();
	
	public void printSound() {
		System.out.println(getName() + "��(��) " + makeSound() + " �뷡�մϴ�.");
	}
	
	
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.printSound();
	}
}
