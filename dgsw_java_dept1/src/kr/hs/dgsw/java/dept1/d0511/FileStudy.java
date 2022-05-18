package kr.hs.dgsw.java.dept1.d0511;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy {

	public void studyFileData() throws Exception {

		File file = new File("C:/90_ETC/javaStudy/sample.txt");
		File file2 = new File("C:/90_ETC/javaStudy/void.txt");
		File file3 = new File("C:/90_ETC/javaStudy");
		
		/* ������ ���� ���� */
		boolean exist = false;
		exist = file.exists();
		System.out.println("������ ���� ���� Ȯ��");
		System.out.println(file.getName() + "  " + exist);
		System.out.println(file2.getName() + "  " + file2.exists());
		System.out.println(file3.getName() + "  " + file3.exists());
		System.out.println();
		
		/* ������ ��� */
		String path = file.getPath();
		String absolutePath = file.getAbsolutePath();
		String canonicalPath = file.getCanonicalPath();
		
		System.out.println("������ ���");
		System.out.println(file.getName());
		System.out.println("  path : " + path);
		System.out.println("  absolutePath : " + absolutePath);
		System.out.println("  canonicalPath : " + canonicalPath);
		System.out.println();
		
		/* ������ ũ�� */
		long size = file.length();
		System.out.println("������ ũ��");
		System.out.println(file.getName() + "  " + size);
		System.out.println(file2.getName() + "  " + file2.length());
		System.out.println(file3.getName() + "  " + file3.length());
		System.out.println();
		
		/* ������ �ð� */
		long modifiedTime = file.lastModified();
		System.out.println("������ ���� �ð�");
		
		Date date = makeDate(modifiedTime);
		String time = formatDate(date);
		
		System.out.println(file.getName() + "  " + modifiedTime + "  " + time);
		System.out.println(file2.getName() + "  " + file2.lastModified());
		System.out.println(file3.getName() + "  " + file3.lastModified());
		System.out.println();
		
		/* ���ϰ� ���丮 ���� */
		boolean bFile = file.isFile();
		boolean bDir = file.isDirectory();
		System.out.println("���ϰ� ���丮 ����");
		System.out.println(file.getName() + "  " + bFile + " " + bDir);
		System.out.println(file2.getName() + "  " + file2.isFile() + " " + file2.isDirectory());
		System.out.println(file3.getName() + "  " + file3.isFile() + " " + file3.isDirectory());
		System.out.println();

	}
	
	public void studyManage() throws Exception {
		
		File file = new File("C:/90_ETC/javaStudy/hello.txt");
		
		/* ���� ����� */
		boolean created = file.createNewFile();
		System.out.println("���� �����");
		System.out.println(file.getName() + "  " + created);
		System.out.println();
		
		/* ���� �����ϱ� */
		boolean deleted = file.delete();
		System.out.println("���� �����ϱ�");
		System.out.println(file.getName() + "  " + deleted);
		System.out.println();
		
		/* ���� �̸� �ٲٱ� */
		File file1 = new File("C:/90_ETC/javaStudy/sample.txt");
		File newFile = new File("C:/90_ETC/javaStudy/second.txt");
		boolean renamed = file1.renameTo(newFile);
		System.out.println("���� �̸� �ٲٱ�");
		System.out.println(file1.getName() + "  " + renamed);
		System.out.println();
	}
	
	public void studyDirectory() {
		File dir = new File("C:/90_ETC/javaStudy/child");

		/* ���丮 ����� */
		boolean created = dir.mkdir();
		System.out.println("���丮 �����");
		System.out.println(dir.getName() + "  " + created);
		System.out.println();
		
		/* ���丮 �����ϱ� */
		boolean deleted = dir.delete();
		System.out.println("���丮 �����ϱ�");
		System.out.println(dir.getName() + "  " + deleted);
		System.out.println();
		
		/* ���丮 ����� 2 */
		File dir2 = new File("C:/90_ETC/javaStudy/sub/images");
		dir2.mkdirs();
		System.out.println("���丮 �����");
		System.out.println(dir2.getName() + "  " + created);
		System.out.println();
	}
	
	public void studyList() {
		File dir = new File("C:/");
		
		String[] list = dir.list();
		File[] listFiles = dir.listFiles();
		
		/*for (String item : list) {
			System.out.println(item);
		}*/
		
		for (File file : listFiles) {
			System.out.println(file.getName());
		}
	}
	
	
	public Date makeDate(long unixTime) {
		return new Date(unixTime);
	}
	
	public String formatDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
	
	public static void main(String[] args) throws Exception {
		FileStudy fileStudy = new FileStudy();
		//fileStudy.studyFileData();
		//fileStudy.studyManage();
		//fileStudy.studyDirectory();
		fileStudy.studyList();
	}
	
	
}
