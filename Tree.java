package cct.com.sem5;

public class Tree {
	
	int d = 0;
	static BSTNode root;
	public String toString(int d){
		return " "+ d;
	}
	
	
	public static void main(String[] args) {
		Tree t = new Tree();
		t.insert(55);
		t.insert(2);
		t.insert(76);
		t.insert(2);
		t.insert(9);
		t.insert(1);
		t.insert(90);
		t.insert(43);
		t.Postorder(root);
		
	}
	
	public void insert(int data){		
		BSTNode n = new BSTNode(data);
		if(root == null){
			root = n;
		}
		while(root != null){
			if(n.data <= root.data){
				//root = root.left;
				if(root.left == null){
					root = n;
				}
			}else if(n.data > root.data){
				//root = root.right;
				if(root.right == null){
					root = n;
				}
			}else if(n.data == root.data){
				break;
			}
		}			
	}
	
	public void Postorder(BSTNode root){
		if(root != null){
			Postorder(root.left);
			Postorder(root.right);
			System.out.println(root.data);
		}
	}
}
