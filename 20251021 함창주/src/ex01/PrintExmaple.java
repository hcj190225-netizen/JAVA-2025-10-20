package ex01;
/*
 * 1. 한 파일에는 한 클래스만 있는 것이 일반적
 * 2. 두개 클래스가 존재하면 public 키워드는 한 곳만 지정
 * --> public 키워드가 있는 곳 클래스명이 파일명
 * 3. public이 없는 클래스가 두 개 이상 존재할 떄는 파일명은 클래스명 아무거나 사용 가능
 * 
 */
public class PrintExmaple {

	public static void main(String[] args) {
//이 코드는 콘솔 출력시 사용하는 구문
		System.out.println("Hello,Java");

		int age = 25 ;
		
		System.out.println("안녕하세요, 함창주입니다. ");
		System.out.println("안녕하세요,"+ age +"살 함창주입니다. ");
		System.out.print("안녕하세요, 함창주입니다. ");

	}

}

class Test {

}
