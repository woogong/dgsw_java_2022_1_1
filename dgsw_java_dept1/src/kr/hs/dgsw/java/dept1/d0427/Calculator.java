package kr.hs.dgsw.java.dept1.d0427;

import java.util.Scanner;

public abstract class Calculator {

	protected final Scanner scanner;
	
	protected int value1;
	
	protected int value2;
	
	public Calculator() {
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
		while (true) {
			// �� ���� ������ �Է¹޴´�.
			this.inputValues();
			
			if (isExitCondition()) {
				break;
			}
			
			// ����� �����Ѵ�.
			int result = this.calculate();
			
			// ����� ����Ѵ�.
			this.showResult(result);
		}
		
		this.scanner.close();
		System.out.println("���α׷��� ����˴ϴ�.");
	}
	
	public void inputValues() {
		System.out.println("�� ������ �Է��ϼ���.");
		this.value1 = this.scanner.nextInt();
		this.value2 = this.scanner.nextInt();
	}
	
	public abstract int calculate();
	
	public void showResult(int result) {
		System.out.printf("%d %s %d = %d\n", value1, getOperator(), value2, result);
	}

	public abstract String getOperator();
	
	public boolean isExitCondition() {
		return (value1 == 0 && value2 == 0);
	}
}






