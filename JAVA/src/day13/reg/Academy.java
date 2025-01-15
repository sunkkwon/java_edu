package day13.reg;

import java.util.ArrayList;
import java.util.List;

public class Academy {

	public static void main(String[] args) {
		
		// 일반인 과정
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("일반권순길"));
		personList.add(new Worker("일반나덕순"));
		personList.add(new HighStudent("일반권재현"));
		personList.add(new MiddleStudent("일반권나현"));
		
		Course<Person> personCourse = new Course<Person>(personList);
		personCourse.createCourse("일반인과정", personCourse);
		personCourse.printStudentList(personCourse);
		
		// 직장인 과정
		List<Worker> workerList = new ArrayList<Worker>();
		workerList.add(new Worker("직장권순길"));
		workerList.add(new Worker("직장나덕순"));
		workerList.add(new Worker("직장권재현"));
		workerList.add(new Worker("직장권나현"));
		
		Course<? super Worker> workerCourse = new Course<Worker>(workerList);
		Course<?> createdWorkerCourse = workerCourse.createWorkerCourse("직장인과정", workerCourse);
		Course<?> createdWorkerCourse2 = workerCourse.createWorkerCourse("직장인과정2", personCourse);
		workerCourse.printStudentList(createdWorkerCourse);
		workerCourse.printStudentList(createdWorkerCourse2);
		
		// 학생과정
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("학생권순길"));
		studentList.add(new Student("학생나덕순"));
		studentList.add(new Student("학생권재현"));
		studentList.add(new Student("학생권나현"));
//		studentList.add(new Person("일반권나현"));
		
		Course<? extends Student> studentCourse = new Course<Student>(studentList);
		studentCourse.createStudentCourse("학생과정", studentCourse);
		
		List<MiddleStudent> middleStudentList = new ArrayList<MiddleStudent>();
		middleStudentList.add(new MiddleStudent("중권순길"));
		middleStudentList.add(new MiddleStudent("중나덕순"));
		Course<MiddleStudent> middleStudentCourse = new Course(middleStudentList);
		middleStudentCourse.createStudentCourse("중학생과정", middleStudentCourse);
		
		studentCourse.printStudentList(middleStudentCourse);
		studentCourse.printStudentList(studentCourse);
	}
	
}
