import java.io.File;
import java.io.IOException;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		File f = new File("");
		try {
			f.createNewFile();
		} catch (IOException e1) {
			// TODO: handle exception
			e1.printStackTrace();
			
			//배치 프로그래밍의 경우...
			f = new File("새로운 경로..");
			try{
				f.createNewFile();
			}catch (IOException e){}
			
			//웹 프로그래밍의 경우..
			throw new RuntimeException(e1.getMessage(),e1);
		}
		
		//int number = Integer.parseInt("ABC...");
		try{
			System.out.println("---");
			System.out.println("try문");
			System.out.println("숫자로 변환합니다..");
			//int number2 = Integer.parseInt("10");
			int number2 = Integer.parseInt("ABC...");
			System.out.println("숫자로 변환이 완료되었습니다.");
		}
		catch(NumberFormatException e){
			System.out.println("---");
			System.out.println("catch문");
			System.out.println("에러 발생!뿌잉뿌잉!");
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("---");
			System.out.println("finally문");
			System.out.println("마지막 작업 입니다...");
		}
		
		for(;;){
			//System.out.println("무한 반복 중....");
		}
		
	}

}
