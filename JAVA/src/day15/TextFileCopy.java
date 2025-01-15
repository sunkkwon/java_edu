package day15;

import java.io.FileReader;
import java.io.FileWriter;

public class TextFileCopy {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		int data = 0;
		
		try {
			fr = new FileReader("./src/day15/Test.txt");
			fw = new FileWriter("./src/day15/Test2.txt");
			
			// 파일로부터 입력
			while( (data = fr.read()) != -1 ) {
				// 파일로 출력
				fw.write(data);
			}
			
			fr.close();
			fw.close();
			System.out.println("파일이 복사 되었습니다");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("입출력시 오류 발생");
			e.printStackTrace();
		}
		
	}
}
