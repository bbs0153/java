import java.io.FileWriter;
import java.io.IOException;

class  ExceptionTest08
{
	public static void main(String[] args) 
	{
		FileWriter fw = null;
		try{
		fw = new FileWriter("c:/�ڹٽ��͵�/byun.txt");
		fw.write("������ �ٺ�");
		System.out.println("������ �����Ͽ����ϴ�.");
		
		}catch(IOException e){
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		
		finally{
			if(fw!=null)
			{
				try{
				fw.close();
				}catch(Exception e){}
			}
		}
	}
}
