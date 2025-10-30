package ex06;



public class ClassEx01 {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setAge(29);
	    System.out.println(s1.getAge());
	
		s1.setName("함창주");
		System.out.println(s1.getName());
		
		s1.setAddress("강동구 천호동");
		System.out.println(s1.getAddress());
		
		s1.study();
	    
		System.out.println("---------------------");
		
		Student s2 = new Student();
		
		s2.setName("함창주");
		s2.setAddress("강동구 천호동");
		s2.setAge(29);
		s2.study();	
		
		
		System.out.println("---------------------");
		Student s3 = new Student("함창주", 29, "강동구 천호도");
		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		System.out.println(s3.getAddress());
		s3.study();
		
	}

}

/*
 * 클래스 - 멤버변수(속성), 멤버 메소드(함수)
 * 멤버변수 - 정적(상태), 멤버메소드-동적(행동)
 */
class Student{
	
	private String name;
	private int age;
	private String address;
	
	
	public Student() {
		System.out.println("디폴드 생성자 호출");
	}


	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.address = addr;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
    
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	void study() {
		System.out.println(name + " Java 공부 중 입니다.");
	}	
}

