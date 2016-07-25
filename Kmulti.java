//最大K乘积问题：将一个n位 的十进制数分成K段，求这K段数的最大乘积。
package com.agrothrim.exercise3;

import java.util.Scanner;

public class Kmulti {
	public static long[][] ArrayInit( int n, String str, long[][] d){
		for(int i = 1; i <= n; i++){
			int t = i - 1;
			
			for(int j = i; j <= n; j++){
				//str.charAt(t) - '0'可将str中下标为t的数字字符转换为“字面值”相等的数字
				d[i][j] = d[i][j - 1]*10 + str.charAt(t) - '0';
				t++;
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		return d;
	}
	
	public static void main(String[] args) {
		System.out.println("请输入十进制数位数及要划分为的段数:");
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int k = read.nextInt();
		
		System.out.println("请输入位数为"+n+"的十进制数:");
		int value = read.nextInt();
		String str = Integer.toString(value);
		
		long[][] m= new long[n+1][n+1];//原十进制数前i位的最大j乘积
		long[][] d= new long[n+1][n+1];//保存原十进制数的第i位到第j位所组成的十进制数
		
		d = ArrayInit( n, str, d);
		System.out.println("------------------");
		
		System.out.println(str+"的 最大"+k+"乘积为:"+new getMaxI().MaxI(n, k, m, d));
	}
}
