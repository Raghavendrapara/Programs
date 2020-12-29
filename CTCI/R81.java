/*input
*/
import java.util.*;
class R81{

	static int memo[] = new int[1000];
	public static void main(String[] args) {
		
		int n = count(70);
		System.out.println(n);
		n=dp(70);
		System.out.println(n);
	}
	static int count(int n){

		if(n==0)
			return 1;
		if(n<0)
			return 0;
        if(memo[n]>0)
        	return memo[n];
		return (memo[n]=count(n-1)+count(n-2)+count(n-3));
	}
	static int dp(int n){

		int dpp[] = new int[n+1];
		dpp[1] = 1;
		dpp[2] = 2;
		dpp[3] = 4;
		for(int i=4;i<=n;i++){

			dpp[i] = dpp[i-1]+dpp[i-2]+dpp[i-3];


		}
		return dpp[n];

	}
}