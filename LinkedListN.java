package cct.com.sem5;

public class LinkedListN {
	
	static int d = 0;
	static ANode o;
	static ANode head;
	static ANode current;
	
	public static void main(String[] args) {
		insertNodeFront(222); //insert 5 x Nodes
		insertNodeFront(333);
		insertNodeFront(444);
		insertNodeFront(555);
		insertNodeFront(777);
		System.out.println("LIST WITH 5 X NODES");
		printLL();			  //print Nodes
		System.out.println();System.out.println();System.out.println("2 X SEARCHES");
		searchNode(444);
		searchNode(888);
		System.out.println();System.out.println("HEAD OF THE NODE LIST");
		System.out.println("The head of the list is :"+head.data);
		System.out.println();System.out.println("DELET 2 X NODES FROM THE LIST");
		deleteListElement(444);
		printLL();
		System.out.println();
		deleteListElement(555);
		printLL();
		System.out.println();System.out.println();System.out.println("SEARCH FOR ONE OF THE DELETED NODES");
		searchNode(444);
	}
	
	public static void insertNodeFront(int data){		
		ANode n = new ANode(data);
		n.next = head;
		if(head != null){
			head.prev = n;
		}
		head = n;
		n.prev = null;
		
	}
	
	public static ANode searchNode(int d){
		ANode n = new ANode(d);
		n = head;
		while(n != null && n.data != d){
			n = n.next;
		}
		if(n != null && n.data == d){
			System.out.println("Your input: "+d+" ,is inside the list");
		}else{
			System.out.println("Your input: "+d+" ,is NOT inside the list");
		}
		return n;
	}
	
	public static void deleteListElement(int d){
		ANode n = new ANode(d);
		n = head;
		while(n != null && n.data != d){
			n = n.next;
		}
		if(n != null && n.data == d){
			if(n.prev != null){
				n.prev.next = n.next;
			}else{
				head = n.next;
			}
			if(n.next != null){
				n.next.prev = n.prev;
			}
			System.out.println("Your input: "+d+" ,has been deleted!!");
		}else{
			System.out.println("Your input: "+d+" ,is NOT inside the list");
		}
	}
	
	public static void printLL(){
		current = head;
		do{
			System.out.print(current.data +", ");
			current =current.next;
		}
		while(current != null);
	}
	
	/*public static void insertNodeEnd(int data){
		ANode n = new ANode( data);
		
		if(head == null){						WOULD HAVE LIKED TO HAVE BEEN ABLE TO INSERT NODE AT END OF LIST
			head = n;
			head.prev = null;
			head.next = null;
			
		}else{	
			while(head != null){
				head = head.next;
				if(head == null){
					head = head.prev;
					head.next = n;
					n.prev = head;
					n.next = null;
					return;
				}
			}
		}
	}*/
}
/* WOULD HAVE ALSO LIKED TO HAVE BEEN ABLE TO LINK MY SEARCH METHOD TO MY DELETE METHOD*/

