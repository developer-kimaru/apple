package net.hb.day19_sample;

import java.util.Arrays;

public class TestArray04 {
	public static void main(String[] args) {
		int[ ] su = { 9, 2, 6, 4 } ;
		Arrays.parallelSort(su);
		
		for(int i=0 ; i<su.length; i++) {
			System.out.print(su[i] + " ");
		}
	}
}//class END








