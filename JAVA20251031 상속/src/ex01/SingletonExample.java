package ex01;

public class SingletonExample {

	public static void main(String[]args) {
		
		
		sigleton obj1 = sigleton.getInstace();
		sigleton obj2 = sigleton.getInstace();
		
		if(obj1.equals(obj2)) {
			System.out.println("같은 sigleton 객체");
		}else {
			System.out.println("다른 sigleton 객체");
        }
		
		Sample sam1 = new Sample();
		Sample sam2 = new Sample();
		
		if(sam1.equals(sam2)) {
			System.out.println("같은 Sample 객체");	
			}else {
				System.out.println("다른 Sample 객체");
			}
		
	}
}
