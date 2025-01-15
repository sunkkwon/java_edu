package Day06.Interface;

public class Driver {

	public static void main(String[] args) {
		
		// RC CAR
		RemoteControl carRc = new RcCar();
		carRc.turnOn();			// 시동켜기
		carRc.parking(false);	// 주행모드
		carRc.setSpeed(20); 	// 가속
		carRc.parking(true); 	// 주차
		carRc.turnOff(); 		// 시동 끄기
		
		System.out.println();
		
		RemoteControl.changeBatter(); 	// 배터리 교체
		System.out.println();
		
		// 드론
		RemoteControl droneRc = new Drone();
		droneRc.turnOn();
		
		droneRc.parking(false);
		droneRc.setSpeed(15);
		droneRc.parking(true);
		droneRc.turnOff();
		System.out.println();
	}
}
