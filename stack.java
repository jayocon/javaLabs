package cct.com.sem5;
public class stack {	
	
	static int [] array1 = new int [6];
	static int top = 0 ;
	static int full = array1.length;

	public static void main(String[] args) {
		stackEmpty();
		stackPush(1);
		stackPush(2);
		stackPush(3);
		stackPush(4);
		stackPush(5);
		stackPush(6);
		stackPush(7);
		stackPrint();
	}

	static boolean stackEmpty() {
	
			if(top == 0 ){
				System.out.println("Stack is empty!!");
				return true;
			}else{
				return false;
			}
	}
			
	static boolean stackFull() {
		
		if(top == full ){
			return true;
		}else{
			return false;
		}
	}
	
	public static void stackPush(int in){
		if(stackFull()){
			System.out.println("Not enough room in stack!!!");
		}else{
			array1[top] = in;
			top = top+1;
		}
	}
	
	public static void stackPop(){
		if(stackEmpty()){
			System.out.println("Underflow!!!");
		}else{
			top = top-1;
		}
	}
	public static void stackPrint(){
		if(stackEmpty()){
			//System.out.println("Stack is empty.");
		}else
		for(int i = 0; i < top; i++){
			System.out.println(array1[i]);
		}
	}
}


