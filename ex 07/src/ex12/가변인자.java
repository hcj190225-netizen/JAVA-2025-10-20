package ex12;

public class 가변인자 {

	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate(",",5,10,20));
				
}
	static String concatenate(String delim, int... args) {
		
		System.out.println(delim + " | " args);
		
		
		for(int s : args)
			System.out.println();
	}
}