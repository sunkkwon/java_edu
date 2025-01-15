package day15;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		
		// 파일경로
		String filePath = "./src/day15/sample.dat";
		
		try (
				// FileOutputStream 객체이용, Byte 단위로 출력
				FileOutputStream fos = new FileOutputStream(filePath);
				
				// BufferedOutputStream 객체 이용하여 출력 성능 향상 
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				// DataOutputStream 
				DataOutputStream dos = new DataOutputStream(bos);
			){
			
			dos.writeInt(1000);
			dos.writeDouble(3.14);
			dos.writeBoolean(true);
			System.out.println("파일을 출력");
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
