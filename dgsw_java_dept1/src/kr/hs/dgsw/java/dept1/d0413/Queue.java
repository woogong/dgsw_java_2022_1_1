package kr.hs.dgsw.java.dept1.d0413;

public class Queue {

	public void add(String value) {
		
	}
	
	public String poll() {
		return null;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.add("Dog");
		queue.add("Lion");
		queue.add("Shark");
		queue.add("Butterfly");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
	
}
