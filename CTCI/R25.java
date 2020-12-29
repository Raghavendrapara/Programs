/*input
1 2 3 4
*/
import java.util.*;
	class R25{
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a1=sc.nextInt();
			int a2=sc.nextInt();
			int b1=sc.nextInt();
			int b2=sc.nextInt();
			LLNode head1=new LLNode(a1);
			LLNode node1=new LLNode(a2);
			head1.setNext(node1);
			LLNode head2=new LLNode(b1);
			LLNode node2=new LLNode(b2);
			head2.setNext(node2);
			System.out.println(head1.getValue()+"  "+head1.getNext().getValue());
		    System.out.println(head2.getValue()+"  "+head2.getNext().getValue());
		    int s =sum(head1,head2,0).sum;
				
		}
		static SumCarry sum(LLNode node1,LLNde node2){

			if(node1.getNext()==null && node2.getNext()==null){

				int sum=node1.getValue()+node2.getValue();
				int carry=sum/10;
				sum=sum%10;
				return new SumCarry(sum,carry);
			}
			if(node1.getNext()!=null && node2.getNext()==null)
			return sum(node1.getNext(),node2);
			else if(node1.getNext()==null && node2.getNext()!=null)

		}
	}
	class LLNode{
		private int value;
		private LLNode next;
		LLNode(int value){

			this.value=value;
			this.next=null;
		
		}
		public int getValue(){
			return value;
		}
		public LLNode getNext(){
			return this.next;
		}
		public void setNext(LLNode current){
			this.next=current;
		}
		//public String toString(){
		//return head.toString();
		//}
	}
	class SumCarrry{
		int sum;
		int carry;
		SumCarry(int s,int c){
			this.sum=s;
			this.carry=c;
		}
	}