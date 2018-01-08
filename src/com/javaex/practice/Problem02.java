package com.javaex.practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] aa=new double[5];
		double sum=0;
		double avg=0;
		int i;
		
		for (i=0;i<aa.length;i++) {
			aa[i]=sc.nextDouble();
			sum+=aa[i];
			avg=sum/aa.length;
		}
		System.out.println("평균은 "+avg+" 입니다.");
		
	}

}
