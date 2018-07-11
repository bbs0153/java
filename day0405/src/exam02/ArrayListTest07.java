package exam02;

import java.util.ArrayList;

class Human
{
	private String name;
	private int age;
	
	public void eat(String some) {
		System.out.println(name+"��(��) "+some+"��(��) �Ծ��");
	}
	
	
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Human() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name + ","+age;
	}
	
}

public class ArrayListTest07 {

	public static void main(String[] args) {
			
		ArrayList list = new ArrayList();
		
		list.add("������");
		list.add(2018);
		list.add(true);
		list.add(183.7);
		
		Human p = new Human("����ȣ",20);
		list.add(p);
		
		System.out.println(list);
		//��¹��� list�� ������ ArrayList�� toString()�� �����Ѵ�.
		
		for(int i = 0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
			
			if(obj instanceof Human) {
				((Human)obj).eat("���̽�ũ��");
			}
		}
		
	//	int []arr = new int[100];
	//	ArrayList arr = new ArrayList();
		
	}

}
