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
			
			//��ġ ���α׷����� ���...
			f = new File("���ο� ���..");
			try{
				f.createNewFile();
			}catch (IOException e){}
			
			//�� ���α׷����� ���..
			throw new RuntimeException(e1.getMessage(),e1);
		}
		
		//int number = Integer.parseInt("ABC...");
		try{
			System.out.println("---");
			System.out.println("try��");
			System.out.println("���ڷ� ��ȯ�մϴ�..");
			//int number2 = Integer.parseInt("10");
			int number2 = Integer.parseInt("ABC...");
			System.out.println("���ڷ� ��ȯ�� �Ϸ�Ǿ����ϴ�.");
		}
		catch(NumberFormatException e){
			System.out.println("---");
			System.out.println("catch��");
			System.out.println("���� �߻�!���׻���!");
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("---");
			System.out.println("finally��");
			System.out.println("������ �۾� �Դϴ�...");
		}
		
		for(;;){
			//System.out.println("���� �ݺ� ��....");
		}
		
	}

}
