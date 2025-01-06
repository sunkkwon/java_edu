package Day01;

public class Ex01_BasicStructure {
	int age   = 20;
	int level = 99;
	int energy;
	
	public int sum(int x, int y) {
		System.out.println("\nx: " + x);
		System.out.println("y: " + y);
		int result = x + y;
		
		return result;
		
	}
	
	public static void main(String[] args) {
	
		Ex01_BasicStructure Ex01 = new Ex01_BasicStructure();
		
		Ex01.energy = 100;
		
		System.out.println("Day01 Ex01_Basic Structure");
		
		System.out.println("\nage : "    + Ex01.age);
		System.out.println("level : "  + Ex01.level);
		System.out.println("energy : " + Ex01.energy);
//		System.out.println("sum : "    + Ex01.sum(5, 15));
		int answer = Ex01.sum(10, 20);
		System.out.println("answer : "    + answer);

}
}
