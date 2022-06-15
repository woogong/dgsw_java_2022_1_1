package kr.hs.dgsw.java.dept1.d0608;

import java.util.Random;

public class Engineer implements Runnable {

	private final Counter counter;
	
	public Engineer(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		while (true) {
			String work = counter.getProblem();
			
			if (work != null) {
				System.out.println("����Ʈ�� ������ �����մϴ�. - " + work);
				try {
					Thread.sleep(new Random().nextInt(10000) + 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("����Ʈ�� ������ �����մϴ�. - " + work);
			} else {
				synchronized (counter) {
					try {
						counter.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}
	
}
