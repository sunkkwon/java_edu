package day15;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class WriterEx {
	public static void main(String[] args) {
		// 파일경로
		String filePath = "./src/day15/sample.dat";
		
		try (
				// FileWriter, 문자 단위로 출력
				FileWriter fw = new FileWriter(filePath);
				
				// BufferedWriter 객체 이용하여 출력 성능 향상 
				BufferedWriter bw = new BufferedWriter(fw);
			){

			bw.write("Hello 권순길 ");
			bw.write("가나다라");
			
			System.out.println("ssmple 파일 생성");
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
