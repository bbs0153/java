import java.util.Scanner;
public class Adultb2
{
   public static void main(String []args)
   {
 
         String name;
         //��ǻ�;ȿ� �޸𸮻� ������ Ȯ������
         //�� ������ �̸��� name���� �Ұž�
         //�׾ȿ� ���� ����(String)�� �����Ҳ�
         int age;
         //������ ������ ������ Ȯ���ϰ� �� �̸��� age�� �Ҳ�
         
	Scanner sc = new Scanner(System.in);
	
	System.out.println("�̸��� �Է�==>");
	name = sc.next();	
	
	System.out.println("���̸� �Է�==>");	
	age = sc.nextInt();	
        
	System.out.println("�̸���:"+name+"\n���̴�:"+age+"");
            
            

    }


}

//�ڹ��� �⺻�ڷ��� 8������ �����ϰ� ���� �� ���ô�.
//�ڹ��� ��������ڸ� �����ϰ� ����ڷ� ���� �ΰ��� ������ �Է¹޾� ��Ģ������ �����Ͽ� ����� ����ϴ� ���α׷��� �ۼ��մϴ�.
