package ex01;

/* 
 * 싱글톤-  : 객체 생성을 1개만 생성해서 공유한다.
 */

public class sigleton {
	
	 sigleton sigleton = new sigleton();

	private sigleton() {    //외부에서 객체 생성불가
		
	}
	
	// 생성된 sigleton 객체를 사용(참조)할 수 있는 유일한 통로 역할을 한다.
	public static sigleton getInstace() {
		return sigleton;
	     }
	}

	class Sample{
		public Sample() {
			
			
	}
		
		sysi
	}


