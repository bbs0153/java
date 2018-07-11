package exam04;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {

		File file = new File("C:\\자바스터디\\day0320\\Hello.java");

		String path = file.getAbsolutePath();
		String name = file.getName();
		String path2 = file.getPath();
		String parent = file.getParent();

		System.out.println("path:" + path);
		System.out.println("name:" + name);
		System.out.println("path2:" + path2);
		System.out.println("parent:" + parent);

		boolean f1 = file.isDirectory();
		System.out.println(f1);
		
		boolean f2 = file.isFile();
		System.out.println(f2);
	}

}
