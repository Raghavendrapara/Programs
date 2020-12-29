/*input
6
*/
import java.util.*;
class R811{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]={25,10,5,1};
		int ans=call(n,arr);
		System.out.println(ans);
	}
	static int call(int n,int arr[]){

		if(n<0)
			return 0;
		if(n==0)
			return 1;
		int ways=0;
		for(int i=0;i<arr.length;i++)
		ways+= call(n-arr[i],arr);
	return ways;

	}
}