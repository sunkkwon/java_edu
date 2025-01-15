package Day06.Interface;

public interface RemoteControl {

	int MAX_SPEED = 300;
	int MIN_SPEED = 0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	
	//디폴트 메소드
	default void parking(boolean check) {
		if(check) {
			System.out.println("주차 되었습니다");
			setSpeed(MIN_SPEED);
		}
		else {
			System.out.println("주행 모드를 시작합니다");
			setSpeed(10);
		}
	}
	
	//static 메소드
	//구현 객체가 없어도 인터페이스 만으로 호출 가능한 메소드
	static void changeBatter() {
		System.out.println("배터리를 교채 했습니다");
	}
}
