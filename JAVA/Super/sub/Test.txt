package day15;

import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputReaderAndFileWriter {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		FileWriter fw = null;
		
		int data = 0;
		try {
			fw = new FileWriter("./src/day15/Test.txt");
			
			// 입력
			while ( (data = isr.read()) != -1 ) {
				fw.write(data);
			}
			
			isr.close();
			fw.close();
			System.out.println("텍스트 파일이 저장 되었습니다");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("입출력시 에러가 발생");
			e.printStackTrace();
		}
	}
}
