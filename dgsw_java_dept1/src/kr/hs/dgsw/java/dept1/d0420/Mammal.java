package kr.hs.dgsw.java.dept1.d0420;

public class Mammal extends Animal {

	protected double bodyTemperature;
	
	public double getBodyTemperature() {
		return bodyTemperature;
	}
	
	@Override
	public void birth() {
		System.out.println("��� ��ӿ��� ������ Ű���� �����ϴ�.");
	}
	
}
