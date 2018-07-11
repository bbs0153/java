package exam02;

import java.util.ArrayList;

class Human
{
	private String name;
	private int age;
	
	public void eat(String some) {
		System.out.println(name+"이(가) "+some+"을(를) 먹어요");
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
		
		list.add("이현진");
		list.add(2018);
		list.add(true);
		list.add(183.7);
		
		Human p = new Human("이태호",20);
		list.add(p);
		
		System.out.println(list);
		//출력문에 list를 만나면 ArrayList의 toString()이 동작한다.
		
		for(int i = 0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
			
			if(obj instanceof Human) {
				((Human)obj).eat("아이스크림");
			}
		}
		
	//	int []arr = new int[100];
	//	ArrayList arr = new ArrayList();
		
	}

}
