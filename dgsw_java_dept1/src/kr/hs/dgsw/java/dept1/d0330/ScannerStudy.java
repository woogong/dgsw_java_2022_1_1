package kr.hs.dgsw.java.dept1.d0330;

import java.util.Scanner;

public class ScannerStudy {

	private final Scanner scanner;
	
	public ScannerStudy() {
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
		
		String input = null;
		int value = 0;
		
		//while (true) 
		{
			System.out.println("�ܾ �Է��ϼ���.");
			input = this.scanner.next();
			System.out.printf("����� '%s'�� �Է��ϼ̽��ϴ�.\n\n", input);

			System.out.println("������ �Է��ϼ���.");
			value = this.scanner.nextInt();
			System.out.printf("%d�� ������ %d�Դϴ�.\n\n", value, (value * value));
		}
		
		this.scanner.close();
	}
	
	public static void main(String[] args) {
		ScannerStudy scannerStudy = new ScannerStudy();
		scannerStudy.execute();
	}
	
}




