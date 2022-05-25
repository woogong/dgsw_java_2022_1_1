package kr.hs.dgsw.java.dept1.d0525;

public class InterruptStudy {

	public static class Child implements Runnable {
		@Override
		public void run() {
			System.out.println("�ڽ� �����尡 �ῡ ������ϴ�.");
			
			try {
				Thread.sleep(1000000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("�ڽ� �����尡 ����ϴ�.");
		}
	}
	
	public static class Child2 implements Runnable {
		@Override
		public void run() {
			System.out.println("�ڽ�2 �����尡 �ῡ ������ϴ�.");
			
			try {
				synchronized (this) {
					wait();

				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("�ڽ�2 �����尡 ����ϴ�.");
		}
	}

	public static void main(String[] args) {
		//Thread thread = new Thread(new Child());
		//thread.start();
		
		Thread thread2 = new Thread(new Child2());
		thread2.start();
		
		
		try {
			Thread.sleep(1500);

			/*
			System.out.println("�θ� �ڽ��� ����ϴ�.");
			thread.interrupt();
			*/
			
			thread2.notify();
			
			
		} catch (InterruptedException e) {}
		
		
	}
}
