package Ex06_2_상속_다형성;

public class CarMain {
	public static void main(String[]args) {
		
		Car ec = new ElectricCar();
		ec.move();
		ec.fillUp();
	}
}

	