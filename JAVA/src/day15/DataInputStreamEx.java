package day15;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataInputStreamEx {

	public static void main(String[] args) {
		// 파일경로
		String filePath = "./src/day15/sample.dat";
		
		try (
				// FileInputStream 객체이용, Byte 단위로 출력
				FileInputStream fis = new FileInputStream(filePath);
				
				// BufferedInputStream 객체 이용하여 출력 성능 향상 
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				// DataOutputStream 
				DataInputStream dis = new DataInputStream(bis);
			){

			int num = dis.readInt();
			double numDouble = dis.readDouble();
			boolean numBool = dis.readBoolean();
			
			System.out.println("num Int: " + num);
			System.out.println("num Double : " + numDouble);
			System.out.println("num bool : " + numBool);
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
