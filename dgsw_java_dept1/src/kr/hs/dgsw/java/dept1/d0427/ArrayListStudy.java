package kr.hs.dgsw.java.dept1.d0427;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy {

	public void studyArrayList() {
		String[] array = new String[5];
		List<String> list = new ArrayList<String>();
		
		// ����Ʈ�� ���� �߰��ϱ�
		array[0] = "Korea";
		array[1] = "Germany";
		
		list.add("Korea");
		list.add("Germany");
		list.add("China");
		
		// ���� �о����
		String value = array[0];
		value = array[1];
		
		value = list.get(0);
		value = list.get(1);
		
		// ũ��
		int sizeOfArray = array.length;
		int sizeOfList = list.size();
		
		// Ư���� ��ġ�� �ֱ�
		list.add(1, "England");
		
		System.out.println("After adding : " + list.size() + "  " + list.get(2));
		
		
		// �����ϱ�
		array[1] = null;
		
		String str = list.remove(1);
	}
	
	public static void main(String[] args) {
		ArrayListStudy study = new ArrayListStudy();
		study.studyArrayList();
	}
	
}




