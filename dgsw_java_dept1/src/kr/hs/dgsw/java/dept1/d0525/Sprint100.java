package kr.hs.dgsw.java.dept1.d0525;

public class Sprint100 extends Thread {
	private final String name;
	
	private final double record;
	
	public Sprint100(String name, double record) {
		this.name = name;
		this.record = record;
	}

	@Override
	public void run() {
		int time = 0;
		
		while (true) {
			double distance = time * (100 / record);
			System.out.printf("%s ������ %d�ʿ� %.2fm�� �޷Ƚ��ϴ�.\n",
					name, time, distance);
			
			if (distance > 100) {
				break;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			time++;
		}

		System.out.printf("%s ������ �޸��⸦ ���ƽ��ϴ�.\n", name);
	}
	
	public static void main(String[] args) {
		Sprint100 bolt = new Sprint100("����� ��Ʈ", 9.58);
		Sprint100 foo = new Sprint100("�Ϲ���", 13.2);
		
		foo.start();
		bolt.start();
	}
	
}
