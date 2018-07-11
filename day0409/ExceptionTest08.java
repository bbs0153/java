import java.io.FileWriter;
import java.io.IOException;

class  ExceptionTest08
{
	public static void main(String[] args) 
	{
		FileWriter fw = null;
		try{
		fw = new FileWriter("c:/자바스터디/byun.txt");
		fw.write("현진이 바보");
		System.out.println("파일을 생성하였습니다.");
		
		}catch(IOException e){
			System.out.println("예외발생:"+e.getMessage());
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
