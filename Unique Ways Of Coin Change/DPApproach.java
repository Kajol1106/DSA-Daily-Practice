public static int uniqueWaysOfCoinChange(int n, int m, int[] arr) {
	    int[] dp = new Array(n+1).fill(0);
	    dp[0] = 1;
	    for(int i=0; i<m; i++) {
	        for(int j=arr[i]; j<=n; j++) {
	            dp[j] += dp[j-arr[i]];
	        }
	    }
	    return dp[n];
	}