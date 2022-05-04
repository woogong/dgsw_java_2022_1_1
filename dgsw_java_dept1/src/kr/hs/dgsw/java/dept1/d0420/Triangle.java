package kr.hs.dgsw.java.dept1.d0420;

public class Triangle extends Rectangle {
	
	public Triangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public String getType() {
		return "»ï°¢Çü";
	}
	
	@Override
	public double getArea() {
		return super.getArea() / 2;
	}
}
