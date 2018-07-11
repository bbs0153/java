package exam02;

//자바 초기에 컬렉션 프레임워크에
//어떤 자료형이던지 담는 것이 좋은 줄로만 알았다.
//그러나 시간이 지나 보니 결코 좋은 것이 아니더라
// 꺼내온 데이터를 처리하려고 했더니
//결국은 그것 원래 type으로 casting 해야 하니
//좋은 것은 아니더라.
//jdk 1.4 이후에 컬렉션 프레임뭐크를 쓸때는 
//담을 데이터타입을 한정해서 쓰자 권장한다.
//   ==> 제네릭


import java.util.ArrayList;

public class ArrayListTest08 {

	public static void main(String[] args) {
			
		ArrayList list = new ArrayList();
		
		list.add(28);
		list.add(27);
		list.add(27);
		list.add("26");
		list.add(25);
		list.add(20);
		list.add("28");
		
		int tot = 0;
		
		for(int i=0; i<list.size(); i++) {
			
			int n = (Integer)list.get(i);
			
			tot += n;
		}
		System.out.println(tot);
	}

}
