package Ex06_2_상속_다형성;

public class Car {
	public void move() {
		System.out.println("차를 이동합니다.");
		
	}
    //Car 클래스를 상속하여 클래스는 fillUp메소드를
	//반드시 제정의 하세여!!
	public void fillUp() {
		System.out.println("물을 충전합니다");
	}
}
