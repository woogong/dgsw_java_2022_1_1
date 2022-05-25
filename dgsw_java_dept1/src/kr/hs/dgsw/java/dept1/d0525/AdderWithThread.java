package kr.hs.dgsw.java.dept1.d0525;

import java.util.Scanner;

public class AdderWithThread {
	private final Scanner scanner;
	
	public AdderWithThread() {
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
		while (true) {
			System.out.println("�� ������ �Է��ϼ���.");
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();

			if (value1 == 0 && value2 == 0) {
				break;
			}

			// ����� �����ؼ� ����� ����Ѵ�.
			CalculatorThread calculator = 
					new CalculatorThread(value1, value2);
			Thread thread = new Thread(calculator);
			thread.start();
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}

	public static class CalculatorThread implements Runnable {
		private int value1;
		private int value2;
		
		public CalculatorThread(int value1, int value2) {
			this.value1 = value1;
			this.value2 = value2;
		}
		
		@Override
		public void run() {
			try {
				Thread.sleep(15000L);
			} catch (InterruptedException e) {}
			
			int result = value1 + value2;
			System.out.printf("%d + %d = %d\n", value1, value2, result);
			
		}
	}
	
	public static void main(String[] args) {
		AdderWithThread adder = new AdderWithThread();
		adder.execute();
	}
	
}
