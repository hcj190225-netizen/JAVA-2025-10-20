package ex04;

public class InkjetPrinter implements Print {

	public InkjetPrinter() {
		
	}
	
	@Override
	public void print(String message) {
		System.out.println("잉크잿 프린터 출력" + message);
	}
}
