package kr.hs.dgsw.java.dept1.d0608;

import java.util.LinkedList;
import java.util.Queue;

public class Counter {

	private Queue<String> list = new LinkedList<String>();
	
	public void hireEngineers() {
		for (int i = 0 ; i < 1 ; i++) {
			Engineer engineer = new Engineer(this);
			new Thread(engineer).start();
		}
	}
	
	public void acceptRequirement(String problem) {
		list.add(problem);
		
		synchronized (this) {
			this.notify();
		}
	}
	
	public String getProblem() {
		return list.poll();
	}
	
	
	public static void main(String[] args) throws Exception {
		System.out.println("���񽺼��͸� �����մϴ�.");
		
		Counter counter = new Counter();
		counter.hireEngineers();
		
		System.out.println("���� ��ٸ��ϴ�.");
		
		Thread.sleep(1000);
		System.out.println("ù��° ��");
		counter.acceptRequirement("������ �ȵǾ��.");
		
		Thread.sleep(200);
		System.out.println("�ι�° ��");
		counter.acceptRequirement("������ �������.");

		System.out.println("����° ��");
		counter.acceptRequirement("�ڵ����� ���⿡ �������.");

	}
	
	
	
	
}
