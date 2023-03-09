package algo0309;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long[] dp = new long[1000_001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=4; i<dp.length; i++) {
			dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1_000_000_009;
		}
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n] % 1_000_000_009).append("\n");
		}
		
		System.out.println(sb);
	}
}
