package ex02;

import java.util.Arrays;

public class LotteEx01 {

	public static void main(String[] args) {
/*
 * 로또 프로그램
 * 배일 6칸짜리 int 배일
 * 단, 중복 불가
 */
		
		int[] lotto = new int[6];
		boolean flag = false;
		
		
		for(int i=0; i<lotto.length; i++) {
			
			int tmp = (int)(Math.random()*45)+1;
	
			for(int j=0; j<lotto.length; j++) {
				if(tmp==lotto[j]) {
					flag = true;
					break;
				}
			}
			
			if(flag == false) {
			lotto[i] = tmp;
		}else {
			i--;
			flag = false;
			
		}
		
	System.out.println(Arrays .toString(lotto));
	
	
	}
	}
}
