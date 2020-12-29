/*input
2
1 
-1
2
-100 100
*/
import java.util.*;
class Watmelon{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){

        	int n = sc.nextInt();
        	int arr[] = new int[n];
        	int sum=0;
        	for(int i=0;i<n;i++){

        		arr[i] = sc.nextInt();
        		sum+=arr[i];

        	}

        	if(n>=2 && sum>=0){

        		System.out.println("YES");
        	}
        	else if(n==1){
        		if(arr[0]>=0)
        			System.out.println("YES");
        		else
        			System.out.println("NO");
        	}
        	else System.out.println("NO");


        } 
    }
}
