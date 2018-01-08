package com.javaex.practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[] {50000,10000,5000,1000,500,100,50,10,5,1};
		int bb;
		
		System.out.print("금액: ");
		int tt=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if (tt>=a[i]) {
				bb=tt/a[i];
				tt-=a[i]*bb;
				System.out.println(a[i]+"원:"+bb+"개");
			}
		}
	}

}
