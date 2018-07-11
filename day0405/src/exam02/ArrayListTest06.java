package exam02;

import java.util.ArrayList;

class Person
{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
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

public class ArrayListTest06 {

	public static void main(String[] args) {
			
		ArrayList list = new ArrayList();
		
		list.add("������");
		list.add(2018);
		list.add(true);
		list.add(183.7);
		
		Person p = new Person("����ȣ",20);
		list.add(p);
		
		System.out.println(list);
		//��¹��� list�� ������ ArrayList�� toString()�� �����Ѵ�.
		
		for(int i = 0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
	//	int []arr = new int[100];
	//	ArrayList arr = new ArrayList();
		
	}

}
