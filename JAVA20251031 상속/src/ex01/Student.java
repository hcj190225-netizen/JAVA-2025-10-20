package ex01;

// Student 클래스는 Person 클래스 상속
public class Student extends Person {
	
	//맴버변수는 외부 노출 시키지 않는다 -> 정보운닉
	
	private String school;
	
	public Student() {}  // 디폴트 생성자 
	public Student(String name, int age, String school){
		super(name,age);
		this.school= school;
	}
	
	public void study() {
		System.out.println(school + "에서 공부 중입니다.");
		
	}
	

	


}
