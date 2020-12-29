/*input
10
5 4 9 8 7 66 2 5 1 3
*/
import java.util.*;
import java.io.*;
import static java.lang.System.out;
class BinSearch{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		boolean b = search(arr,0,n-1,1);
		System.out.println(b);
	}
	
	static boolean search(int arr[],int l,int r,int key){
		if(l>r){
			return false;
		}
		int mid = (l+r)/2;
		if(arr[mid]==key)
			return true;
		else if(arr[mid]>key){
			return search(arr,l,mid-1,key);
		}
		else if(arr[mid]<key){
			return search(arr,mid+1,r,key);
		}
		return false;
		
	}

	static int gcd(int x,int y){
	return 1;
	}
	
	//static int[] sieve(int n){
	
	
	//}	
		
	}	
		
		
		
		