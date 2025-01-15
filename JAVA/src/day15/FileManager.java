package day15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileManager {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int menuNo;
		
		do {
			menu();
			
			menuNo = sc.nextInt();
			sc.nextLine();
			
			if( menuNo == 0 ) break;
			
			// 파일경로
			System.out.println("파일 경로 : ");
			String filePath = sc.nextLine();
			
			// 메뉴선택
			switch (menuNo) {
				case 1 :	// dir 생성
					makeDirectory(filePath);
					break;
				case 2:		// 파일 목록
					listDirectory(filePath);
					break;
				case 3:		// 파일정보
					fileInfo(filePath);
					break;
				case 4:		// 파일삭제
					deleteFile(filePath);
					break;
				case 5:		// 폴더 삭제
					deleteDirectory(filePath);
					break;
			}
			
		} while ( true );
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("::::::::: 파일 관리 :::::::::");
		System.out.println("1. 폴더 생성");
		System.out.println("2. 폴더 파일목록");
		System.out.println("3. 파일정버 조회");
		System.out.println("4. 파일 삭제");
		System.out.println("5. 폴더 삭제");
		System.out.println("0. 종료");
		System.out.println("::::: 번호 : ");
	}

	private static void makeDirectory(String filePath) {
		// TODO Auto-generated method stub
		File file = new File(filePath);
		
		// mkdir() : 생성할 경로의 상위 경로까지 기존 디렉토리가 존재해야 한다
		// mkdirs(): 생성할 경로의 상위 경로까지 디렉토리를 생성해 준다
		if(file.mkdirs()) {
			System.out.println("디렉토리 생성 성공");
		}
		else {
			System.err.println("디렉토리 생성 실패");
		}
		
		System.out.println("경로 : " + filePath);
		
	}
	
	private static void listDirectory(String filePath) {
		// TODO Auto-generated method stub
		System.out.println(filePath);
		System.out.println("----------------------------------------------------------");
		
		File file = new File(filePath);
		File[] fileList = file.listFiles();		// 하위 경로의 파일목록을 File 배열로 반환
		
		System.out.println("파일명\t\t용량\t\t수정일자");
		for (File subFile : fileList) {
			long update = subFile.lastModified();
			Date date = new Date(update);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
			String updateDate = sdf.format(date);
			
			System.out.print( subFile.getName() + "\t\t");
			System.out.print( subFile.length() + "\t\t");
			System.out.print( updateDate + "\t\t");
			System.out.println();
		}

		System.out.println("----------------------------------------------------------");
	}

	
	private static void fileInfo(String filePath) {
		// TODO Auto-generated method stub
		File file = new File(filePath);
		
		System.out.print("파일 종류 : ");
		if(file.isDirectory()) System.out.println("디렉토리");
		if(file.isFile()) System.out.println("일반 파일");
		
		long update = file.lastModified();
		Date date = new Date(update);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String updateDate = sdf.format(date);
		
		System.out.println("파일명\t\t용량\t\t수정일자");
		System.out.print( file.getName() + "\t\t");
		System.out.print( file.length() + "\t\t");
		System.out.print(updateDate + "\t\t");
		System.out.println();
	}
	

	private static void deleteFile(String filePath) {
		// TODO Auto-generated method stub
		File file = new File(filePath);
		
		if (file.exists()) {
			if( file.delete()) {
				System.out.println("파일 삭제");
			}
			else {
				System.err.println("파일 식제 실패");
			}
		}
		else {
			System.err.println("파일이 존재 하지 않습니다");
		}
	}

	
	private static void deleteDirectory(String filePath) {
		// TODO Auto-generated method stub
		File file = new File(filePath);
		File[] fileList = file.listFiles();		// 하위 파일 목록
		
		// 하위 경로에 파일이 있으면 하위 파일을 먼저 삭제
		if(fileList != null) {
			// 하위 경로의 파일들을 삭제
			for (File subFile : fileList) {
				deleteDirectory(subFile.getPath());
			}
		}
		
		// 폴더(파일) 삭제
		if(file.delete()) {
			System.out.println("폴더(파일) 삭제");
		}
		else {
			System.err.println("폴더(파일) 삭제 실패");
		}
	}

}
