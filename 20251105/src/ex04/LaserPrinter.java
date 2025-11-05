package ex04;

public class LaserPrinter implements Print {
	
	@Override
	public void print(String message) {
		System.out.println("레인저 프린터 출력" + message );
	}
	
}