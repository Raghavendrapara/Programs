import java.util.*;
public class Frog{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=1;i<=n;i++)
      arr[i-1]=sc.nextInt();
    int a=0;
    int ans=10000000;
    int b=Math.abs(arr[1]-arr[0]);
    for(int j=2;j<n;j++)
    {
      if(ans<a+b)
        ans=a+b;
      if(arr[j]