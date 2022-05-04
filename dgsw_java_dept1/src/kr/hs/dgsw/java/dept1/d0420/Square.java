package kr.hs.dgsw.java.dept1.d0420;

public class Square extends Rectangle {

	public Square(int length) {
		super(length, length);
	}

	@Override
	public String getType() {
		return "정사각형";
	}
}
