package kr.hs.dgsw.java.dept1.d0608;

public class SyncStudy {

	private static Object obj = new Object();
	
	public static class Waiter implements Runnable {
		private final String name;
		
		public Waiter(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {
			System.out.println(name + " �����尡 ���۵˴ϴ�.");
			
			// do something
			
			System.out.println(name + " �����尡 ��ٸ��ϴ�.");
			
			try {
				synchronized (obj) {
					obj.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name + " �����尡 �簳�˴ϴ�.");
			
		}
	}
	
	public static void main(String[] args) {
		
		Waiter waiter1 = new Waiter("T1");
		new Thread(waiter1).start();

		Waiter waiter2 = new Waiter("T2");
		new Thread(waiter2).start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		synchronized (obj) {
			obj.notifyAll();
		}
	}
	
}




