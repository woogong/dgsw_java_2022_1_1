package kr.hs.dgsw.java.dept1.d0615;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionStudy {

	public void studyMap() {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("���ѹα�����", 1945);
		map.put("�����ֶ�", 1592);
		map.put("�����Ǳ�", 1392);
		map.put("������������", 1789);
		map.put("���θ����", 476);
		
		map.put("���ѹα�����", 2025);
		
		
		Set<String> keys = map.keySet();
		
		
		Integer year = 0;
		year = map.get("�����ֶ�");
		System.out.println(year);
		
		year = map.get("�Ŵ���߰�");
		System.out.println(year);
		
		year = map.get("���ѹα�����");
		System.out.println(year);
		
	}
	
	public void studyQueue() {
		Queue<String> queue = new LinkedList<String>();
		List<String> list = new LinkedList<String>();
		
		queue.add("Korea");
		queue.add("Japan");
		queue.add("China");
		queue.add("USA");
		
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		
		list.add("Korea");
		list.add("Japan");
		list.add("China");
		list.add("USA");
		
		list.get(0);
		list.get(1);
		list.get(2);
		list.get(3);
	}
	
	public void studySet() {
		Set<String> set = new HashSet<String>();
		set.add("Korea");
		set.add("Japan");
		set.add("Korea");
		set.add("China");
		set.add("Korea");
		set.add("USA");
		
		for (String item : set) {
			System.out.println(item);
		}
		
	}
	
	
	public static void main(String[] args) {
		//new CollectionStudy().studyMap();
		new CollectionStudy().studySet();
		
	}
	
}
