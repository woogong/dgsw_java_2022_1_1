package kr.hs.dgsw.java.dept1.d0420;

public class Circle extends Polygon {

	protected final int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public String getType() {
		return "��";
	}
	
	@Override
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	
}
