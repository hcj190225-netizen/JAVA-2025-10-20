package Ex01;

public class Mainclass {

	public static void main(String[] args) {

		/*
		 * 상위클래스는 하위클래스를 참조 가능
		   그러나 접근 영역은 상위클래스 영역으로 한정
		   만약, 하위클래스 영역있는 메소드를 접근하려면 그 메소드가 상위클래스 메소드를 오버라이딩하면 가능
		   
		   하위클래스는 상위클래스 참조 불가
		 */
		AClass a1 = new AClass();
		a1.fA();                      //FA....
		System.out.println(a1.toString());       //Aclass
		System.out.println("------------------");
		
		AClass a2 = new BClass();
		a2.fA();
		System.out.println(a2.toString());
		
		// Bclass b2 = new Aclass(); //4.해당
		BClass b1 = new BClass();   //fA(), fB(),
		b1.fA();
		b1.fB();
		System.out.println(b1.toString());

		System.out.println("------------------");
		BClass b2 = (BClass)a2; // 해당, b2참조변수는 b1참조변수 참조하는 범위가 같다
		b2.fA();
		b2.fB();
		System.out.println(b2.toString());
		
		
	}
}
