package kr.hs.dgsw.java.dept1.d0420;

public class Reptiles extends Animal {

	@Override
	public void birth() {
		System.out.println("���� ���Ƽ� ��ȭ�մϴ�.");
	}
	
	public static void main(String[] args) {
		
		Reptiles reptiles = new Reptiles();
		reptiles.birth();
		
	}
	
	
}
