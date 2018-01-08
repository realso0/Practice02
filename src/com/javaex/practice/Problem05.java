package com.javaex.practice;

public class Problem05 {

	public static void main(String[] args) {
		int[] a=new int[46];
		int dd=0;
		int number=0; 
		
		while (dd!=6) {
			number=(int)(Math.random()*45+1);
			
			if(a[number]==0) {
				System.out.print(number+" ");
				a[number]=1;
				dd++;
			}
		}

	}

}
