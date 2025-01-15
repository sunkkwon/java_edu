package day15;

import java.io.FileInputStream;

public class ByteTextInput {

	public static void main(String[] args) {
		// 바이트 스트림 클래스
		byte[] data = new byte[1024];
		
		try {
			FileInputStream fis = new FileInputStream("./src/day15/Test.txt");
			int i = 0, b;
//			while( (b = fis.read()) != -1 ) {
//				data[i] = (byte) b;
//				i++;
//			}
			
//			for (byte a : data) {
//				System.out.print((char) a);
//			}

			int byteText = fis.read(data);
			String text = new String(data,0,byteText);
			System.out.println(text);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
