//���K�˻����⣺��һ��nλ ��ʮ�������ֳ�K�Σ�����K���������˻���
package com.agrothrim.exercise3;

import java.util.Scanner;

public class Kmulti {
	public static long[][] ArrayInit( int n, String str, long[][] d){
		for(int i = 1; i <= n; i++){
			int t = i - 1;
			
			for(int j = i; j <= n; j++){
				//str.charAt(t) - '0'�ɽ�str���±�Ϊt�������ַ�ת��Ϊ������ֵ����ȵ�����
				d[i][j] = d[i][j - 1]*10 + str.charAt(t) - '0';
				t++;
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		return d;
	}
	
	public static void main(String[] args) {
		System.out.println("������ʮ������λ����Ҫ����Ϊ�Ķ���:");
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int k = read.nextInt();
		
		System.out.println("������λ��Ϊ"+n+"��ʮ������:");
		int value = read.nextInt();
		String str = Integer.toString(value);
		
		long[][] m= new long[n+1][n+1];//ԭʮ������ǰiλ�����j�˻�
		long[][] d= new long[n+1][n+1];//����ԭʮ�������ĵ�iλ����jλ����ɵ�ʮ������
		
		d = ArrayInit( n, str, d);
		System.out.println("------------------");
		
		System.out.println(str+"�� ���"+k+"�˻�Ϊ:"+new getMaxI().MaxI(n, k, m, d));
	}
}
