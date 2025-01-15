package Day06.Interface;

public class Drone implements RemoteControl {

	int speed;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("드론 전원 ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("드론 전원 OFF");
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		if(speed > MAX_SPEED) {
			this.speed = MAX_SPEED;
			System.err.println("최대 속도");
		}
		else if(speed < MIN_SPEED) {
			this.speed = MIN_SPEED;
			System.err.println("최저 속력");
		}
		else 
			this.speed = speed;
		
		System.out.println("현재 속도: " + this.speed);
	}

}
