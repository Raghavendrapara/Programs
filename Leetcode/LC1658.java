/*input
8
3 2 20 11 1 3 45 1
3
*/
import java.util.*;
class LC1658{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i=1;i<=n;i++){
		
 	    	arr[i-1]=sc.nextInt();
	
		}
		int x=sc.nextInt();
		int vis[]=new int[n];

		int ans = solve(arr, x,0,n-1);
		System.out.println(ans);		
	}

	static int solve(int arr[],int x,int l,int r){

		if(l>r  || l>arr.length-1 || r<0)
			return 0;

		if(x==0){
		return 1;
		}

		else if(x<0){
		return 1000000;  
		}

	
		return 1+Math.min(solve(arr,x-arr[l],l+1,r),solve(arr,x-arr[r],l,r-1));
		
		}
	}

