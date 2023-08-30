package practice;


import java.util.Arrays;
import java.util.Scanner;

public class murderCase 
{
	private Scanner in;
	
	
	public murderCase()
	{
		in = new Scanner(System.in);
		
	}
	
	public void run()
	{
		int testCases = in.nextInt();
		for(int test=0; test<testCases; test++)
		{
			int n = in.nextInt();
			if(n < 4)
			{
				System.out.println(0);
				continue;
			}
			// solve if n >= 4
			int[] dp = new int[n+1];
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 1;
			dp[4] = 2;
			func(dp, n);
			System.out.println(primesCount(dp[n]));
		}
	}
	
	public int primesCount(int n)
	{
		if(n<2)
			return 0;
		boolean[] prime = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0] = false; // mark 0 as non - prime number
		prime[1] = false; // mark 1 ass non- prime number
		// logic is any starting true marked boolean is prime 2 3 5 so on
		int count = 0; // count the number of prime till n;
		for(int i=2; i<=n; i++)
		{
			if(prime[i])
			{
				count++;
				for(int j=2; j<=n/i; j++)
					prime[j*i] = false;
			}
		}
		return count;
		
			
	}
	// function to find the number of bricks required using dynamic programming
	public int func(int[] dp, int n)
	{
		if(dp[n] > 0)
			return dp[n];
		
		dp[n] = func(dp, n-1) + ((n>3)?func(dp,n-4):0);
		return dp[n];
	}
	
	public static void main(String[] args)
	{
		murderCase solution = new murderCase();
		solution.run();
	}
}