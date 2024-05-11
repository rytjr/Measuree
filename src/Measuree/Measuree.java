package Measuree;

import java.util.*;

public class Measuree {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		int sum3 =0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = num; i < num2+1; i++) {
			for(int j = 1; j < i+1; j++) {
				if(i%j == 0) {
					++sum;
				}
			}
			if(sum == 2) {
				list.add(i);
				sum2 += i;
				++sum3;
			}
			sum =0;
		}
		if(sum3 == 0) {
			System.out.print(-1);
		}
		else {
			int min = Collections.min(list);
			System.out.println(sum2);
			System.out.println(min);
		}
	}
}