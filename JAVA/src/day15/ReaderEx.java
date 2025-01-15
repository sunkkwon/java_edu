package day15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderEx {
	public static void main(String[] args) {
		// 파일경로
		String filePath = "./src/day15/sample.dat";
		
		try (
				// FileReader, 문자 단위로 입력
				FileReader fr = new FileReader(filePath);
				
				// BufferedReader 객체 이용하여 출력 성능 향상 
				BufferedReader br = new BufferedReader(fr);
			){

			String text;
			
			while( (text = br.readLine()) != null) {
				System.out.println(text);
			}
			
//			System.out.println("ssmple 파일 생성");
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
