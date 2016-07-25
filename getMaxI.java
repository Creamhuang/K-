package com.agrothrim.exercise3;

public class getMaxI {
	public long MaxI(int n, int k, long[][] m, long[][] d){
		for(int i = 1; i <= n; i++){
			m[i][1] = d[1][i];
		}
	
		for(int i = 1; i <= n; i++){
			for(int j = 2; j<= k; j++){
				long max = 0;
				for(int w = 1; w < i; w++ ){
					long temp = m[w][j-1] * d[w+1][i];
					if(temp > max)
						max = temp;
					
				}
				m[i][j] = max;
			}
		}
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.printf("%-5d",m[i][j]);
			}
			System.out.println();
		}
		return m[n][k];
	}
}
