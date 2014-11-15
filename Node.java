package cct.com.sem5;

public class Node {
	String value;
	Node nextLink;

	public Node(Node nextLink,String value) {
		this.value = value;
		this.nextLink = nextLink;
	}
	public String toString(){
		return value;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Node node1 = new Node("Jason", null);
		Node node2 = new Node ("Tina", null);
		Node node3 = new Node ("Carl", null);
		Node node4 = new Node ("Connolly", null);
		Node node5 = new Node ("Tumulty", null);
		Node node6 = new Node ("McGrane", null);*/
		Node node1 = new Node(null,"Jason");
		Node node2 = new Node (null,"Tina");
		Node node3 = new Node (null,"Carl");
		Node node4 = new Node (null,"Connolly");
		Node node5 = new Node (null,"Tumulty");
		Node node6 = new Node (null,"McGrane");
		node1.nextLink = node4;
		node2.nextLink = node5;
		node3.nextLink = node6;
		node4.nextLink = node2;
		node5.nextLink = node3;
		node6.nextLink = null;
		
		
		printNodeList(node1);

	}
	public static void printNodeList(Node list){
		Node node = list;
		
		while(node != null){
			System.out.println(node);
			node = node.nextLink;
		}
	}

}
