public class HelloWorld_UsingNodes {

	public static void main(String[] args) {

		String a ="Hello, World!";
		Node root=new Node(a.charAt(0));
		root.next = null;
		
		Node temp=root;
		for(int i=1;i<a.length();i++) {
			Node curr=new Node(a.charAt(i));
			temp.next=curr;
			temp=curr;
		}
		
		String ans="";
		Node head=root;
		while(head!=null) {
			ans+=(head.data);
			head=head.next;
		}
		
		System.out.println(ans);
		
	}
	

	static class Node{
		Node next;
		char data;
		Node(char data){
			this.data=data;
		}
	}

}

