package day13.reg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	static Scanner sc = new Scanner(System.in);
	static List<Course<?>> courseList = new ArrayList<Course<?>>();		// 과정 목록
	static List<Person> studentList = new ArrayList<Person>();			// 원생 목록
	
	public static void main(String[] args) {
	
		int no = 0;
		do {
			menu();
			no = sc.nextInt();
			sc.nextLine();			// 엔터 제거
			System.out.println();
			
			switch(no) {
				// 과정 등록
				case 1: courseList.add(createCourse());
					break;
				// 수강생 등록
				case 2: addStudent();
					break;
				// 과정 확인
				case 3: printCourseList();
					break;
				// 수강생 확인
				case 4: printStudent();
					break;
				default: 
					System.err.println("유효한 메뉴 번호를 입력 해주세요1.");
					break;
			}
		} while (no != 0);
	}
	
	// 메뉴출력
	public static void menu() {
		System.out.println("::::: 수강생 등록 프로그램 :::::");
		System.out.println("1. 과정 등록");
		System.out.println("2. 수강생 등록");
		System.out.println("3. 과정 확인");
		System.out.println("4. 수강생 확인");
		System.out.println("5. 종료하기");
		System.out.println(":::::::::::::::::::::::::::::");
		System.out.println("번호: ");
	}
	
	// 과정등록
	public static Course<?> createCourse(){
		System.out.print("- 과정종류 (일반인, 직장인, 학생 : ");
		String type = sc.nextLine();
		System.out.print("- 과정명 : ");
		String name = sc.nextLine();
		
		Course<?> course = switch(type) {
		case "일반인" -> {
			Course<Person> newCours = new Course<Person>();
			yield newCours.createCourse(name, newCours);
		}
		case "직장인" -> {
			Course<Worker> newCours = new Course<Worker>();
			yield newCours.createWorkerCourse(name, newCours);
		}
		case "학생" -> {
			Course<Student> newCours = new Course<Student>();
			yield newCours.createStudentCourse(name, newCours);
		}
		
		default -> throw new IllegalArgumentException("유효하지 않은 과정 종류" + type);
		};
		
		return course;
	}
	
	// 과정 확인
	public static void printCourseList() {
		System.out.println(":::::::: 과정 목록 ::::::::");
		for (Course<?> course : courseList) {
			System.out.println(course);
		}
		System.out.println(":::::::::::::::::::::::::");
	}
	
	// 수강생 등록
	public static void addStudent() {
		System.out.print("- 수강생 종류 (일반인, 직장인, 학생, 중학생, 고등학생) : ");
		String type = sc.nextLine();
		System.out.print("- 수강생 이름 : ");
		String name = sc.nextLine();
		System.out.print("- 등록할 과정명 : ");
		String courseName = sc.nextLine();
		
		Course<?> selectedCourse = new Course();
		
		for (int i = 0; i < courseList.size(); i++) {
			Course<?> course = courseList.get(i);
			// 입력한 과정명과 등록된 과정명이 일치하면
			if(course.getName().equals(courseName)) {
				selectedCourse = course;
				break;
			}
		}
		
		List<Person> students = (List<Person>) selectedCourse.getStudents();
		Person student = switch (type) {
		case "일반인" -> new Person(name);
		case "직장인" -> new Worker(name);
		case "학생" -> new Student(name);
		case "고등학생" -> new HighStudent(name);
		case "중학생" -> new MiddleStudent(name);
		default -> throw new IllegalArgumentException("유효하지 않은 수강생 종류 입니다 : " + type);
		};
		
		students.add(student);
		studentList.add(student);
	}
	
	// 수강생 확인
	public static void printStudent() {
		System.out.print("- 수강생 이름 : ");
		String name = sc.nextLine();
		
		boolean check = false;
		for (int i = 0; i < studentList.size(); i++) {
			Person person = studentList.get(i);
			if(person.getName().equals(name)) {
				System.out.println("* 등록된 수강생 입니다. " + name);
				check = true;
				break;
			}
		}
		
		if(!check) {
			System.out.println("* 등록되지 않은 이름 입니다.");
			return;		// 메소드 종료
		}
		
		for (int i = 0; i < courseList.size(); i++) {
			List<Person> students = (List<Person>) courseList.get(i).getStudents();
			String courseName = courseList.get(i).getName();
			System.out.println(":::::::: 수강 중인 과정 :::::::::");
			for (int j = 0; j < students.size(); j++) {
				if( students.get(j).getName().equals(name) ){
					System.out.println("- " + courseName);
				}
			}
		}
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
	}
	
	
	
}
