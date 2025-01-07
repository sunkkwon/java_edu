package Day06;

import java.util.Scanner;

class Book {
	
	String title, author;

	// alt+shift+S
	public Book() {
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
}


public class BookArray {

	public static void main(String[] args) {
		
		// 객체배열
		Book[] bookArray = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		//사용자 입력
		for (int i = 0; i < bookArray.length; i++) {
			System.out.print("제목: ");
			String title = sc.nextLine();
			System.out.print("저자: ");
			String author = sc.nextLine();
			
			bookArray[i] = new Book(title, author);
			
			
		}
		
		// 출력
		for (Book book : bookArray) {
			System.out.println(book);
		}
		
		sc.close();
	}
}
