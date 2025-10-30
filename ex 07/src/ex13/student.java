package ex13;

public class student {
	
	public String getName()  {
		return name;
	}
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	student(){
		
	}
	

	
		
		
		

	public student(String name, int ban, int no, int kor, int eng, int math) {
		
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public float getAverage() {
		float avg = Math.round(getTotal()/3.0f*100)/100.0f;
		
		return avg;
	}
	 
	public float getAverage2() {
		float avg = getTotal()/3.0f;
				
				return avg;
				
	}
	public String into() {
		return name + ","+ban+","+no+","+kor+","
				+eng+","+math+","+getTotal()+","
				+getAverage();
	}


}
