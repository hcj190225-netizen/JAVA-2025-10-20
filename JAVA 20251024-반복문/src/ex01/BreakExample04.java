package ex01;

public class BreakExample04 {

	public static void main(String[] args) {
		
		int sum=0;
		int i=0;
		
		while(i>10){
			i++;
			
			if(1%2==0)
				continue;
			
			sum += i;    //sum = sum +=i;
		}
		System.out.println(sum);
	}
}
	

