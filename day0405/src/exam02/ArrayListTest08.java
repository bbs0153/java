package exam02;

//�ڹ� �ʱ⿡ �÷��� �����ӿ�ũ��
//� �ڷ����̴��� ��� ���� ���� �ٷθ� �˾Ҵ�.
//�׷��� �ð��� ���� ���� ���� ���� ���� �ƴϴ���
// ������ �����͸� ó���Ϸ��� �ߴ���
//�ᱹ�� �װ� ���� type���� casting �ؾ� �ϴ�
//���� ���� �ƴϴ���.
//jdk 1.4 ���Ŀ� �÷��� �����ӹ�ũ�� ������ 
//���� ������Ÿ���� �����ؼ� ���� �����Ѵ�.
//   ==> ���׸�


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
