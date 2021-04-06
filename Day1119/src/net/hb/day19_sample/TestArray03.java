package net.hb.day19_sample;

import java.util.Arrays;

public class TestArray03 {
	public static void main(String[] args) {
		int[ ] su = { 37, 45, 16, 2, 30, 19 } ;
		Arrays.parallelSort(su);//작은순에서 큰순으로 소트
		
		for(int k : su){ System.out.print(k + " ");	}
		System.out.println();
		
		for(int i=0 ; i<su.length; i++) {
			System.out.print(su[i] + " ");
		}
	}
}//class END








