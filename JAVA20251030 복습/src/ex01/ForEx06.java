package ex01;

public class ForEx06 {

	public static void main(String[] args) {
	
		
		
		/*
		 * 2~5단까지 구구단 출력
		 * 2X1 = 2
		 * 2X2 = 4
		 
		 
		 *
		 *3X1 = 3
		 *3X2 = 6
		 *3X3 = 9
		 *
		 *4X1 = 4
		 *4X2 = 8
		 *4X3 = 12
		 *4X4 = 16
		 *
		 *5X1 = 5
		 *..
		 *5X5 = 25
		*/
		
		for(int i=2; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println();
			}
			i++;
			sum += i;
			
		}
		
		System.out.println("총합 :" + sum);
		

	}

}
