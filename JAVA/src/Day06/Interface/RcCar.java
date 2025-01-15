package Day06.Interface;

public class RcCar implements RemoteControl {

	int speed;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("RC카 전원을 켭니다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("RC카 전원을 끕니다");

	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		//최대 속도를 초과하지 않게 설정
		if(speed > RemoteControl.MAX_SPEED) {
			this.speed = RemoteControl.MAX_SPEED;
			System.err.println("최대속력 초과");
		}
		
		// 처ㅣ저 속력 미만이 되지 않도록 설정
		if(speed < RemoteControl.MIN_SPEED) {
			this.speed = RemoteControl.MIN_SPEED;
			System.err.println("최저 속력 미만");
		}
		else {
			this.speed = speed;
		}
		
		System.out.println("현재속도: " + speed);
	}

}
