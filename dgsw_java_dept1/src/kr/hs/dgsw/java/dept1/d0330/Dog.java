package kr.hs.dgsw.java.dept1.d0330;

public class Dog {
	private final String name;
	
	private int age;

	public Dog(String name) {
		this(name, 0);
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("생성자가 호출되었습니다.");
	}
	
	public void print() {
		System.out.printf("%s는 나이가 %d살입니다.\n", this.name, this.age);
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		
		Dog happy = new Dog("해피", 5);
		happy.print();
		
		Dog puppy = new Dog("퍼피");
		
		
		System.out.println("Count of args : " + args.length);
		for (int i = 0 ; i < args.length ; i++) {
			System.out.printf("%d - %s\n", i, args[i]);
		}
		
	}
}




