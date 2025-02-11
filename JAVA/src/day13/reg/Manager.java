package day13.reg;

// 일반인과정,직장인과정,학생과정을 등록하는인터페이스
public interface Manager {

	// 일반인 과정 생성
	public Course<?> createCourse(String name, Course<Person> course);
	// 직장인 과정 생성 - 
	public Course<?> createWorkerCourse(String name, Course<? super Worker> course);
	// 학생 과정 생성
	public Course<?> createStudentCourse(String name, Course<? extends Student> course);
	
	// 수강생 목록 출력
	public void printStudentList(Course<?> course);
	
}
