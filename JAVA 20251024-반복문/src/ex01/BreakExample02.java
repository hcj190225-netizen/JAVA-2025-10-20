package ex01;

public class BreakExample02 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i = 1; i<=10; i++) {
			
			if(1%2==0)
				continue;
			
			sum+= i;    //sum = sum +=i;
		}
		System.out.println(sum);
	}
}
	

