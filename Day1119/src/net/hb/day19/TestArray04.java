package net.hb.day19;

import java.util.Arrays;

public class TestArray04 {
	public static void main(String[] args) {

		int number[] = {1,4,16,32,8,2} ;
		Arrays.parallelSort(number);
		
		for (int k : number) //136������ for~each �ݺ���
			{System.out.print(k+" ");}
		
		System.out.println();
		
		for (int i =0; i<number.length; i++)
			{System.out.print(number[i]+" ");}
	}
}