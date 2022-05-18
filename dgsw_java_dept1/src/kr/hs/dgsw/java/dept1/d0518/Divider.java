package kr.hs.dgsw.java.dept1.d0518;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {

	private final Scanner scanner;
	
	public Divider() {
		this.scanner = new Scanner(System.in);
	}
	
	private int calculate(int value1, int value2) {
		return value1 / value2;
	}
	
	private void execute() {
		
		try {
			
			System.out.println("�� ������ �Է��ϼ���.");
			
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			int result = calculate(value1, value2);
			System.out.printf("%d / %d = %d\n", value1, value2, result);
			boolean saved = saveResult(value1, value2, result);
			System.out.println("���� ���� ��� : " + saved);
			
			System.out.println("���α׷��� �����մϴ�.");			
			
		} catch (InputMismatchException e) {
			System.out.println("�ùٸ� ������ �ƴϾ ����� ������ �� �����ϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			this.scanner.close();
		}
		
		/*catch (Exception e) {
			System.out.println("���ܰ� �߻��߽��ϴ�. - " + e);
			if (e instanceof InputMismatchException) {
				System.out.println("�ùٸ� ������ �ƴϾ ����� ������ �� �����ϴ�.");
			} else if (e instanceof ArithmeticException) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
		}*/
	}
	
	public static final String FILE_PATH = "C:/90_ETC/javaStudy/result.txt";
	
	private boolean saveResult(int value1, int value2, int result) {
		OutputStream os = null;
		
		try {
			File file = new File(FILE_PATH);
			os = new FileOutputStream(file);
			
			String str = String.format("%d / %d = %d\n", value1, value2, result);
			os.write(str.getBytes());
			
			return true;
		} catch (IOException e) {
			System.out.println("���� ���忡 �����Ͽ����ϴ�.");
		} finally {
			System.out.println("saveResult�� finally�� �����");
			
			try {
				os.close();
			} catch (IOException e1) {}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Divider divider = new Divider();
		divider.execute();
	}
	
}









