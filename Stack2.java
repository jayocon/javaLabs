package cct.com.sem5;


public class Stack2 {

	int [] arr = new int [7];
	static int top = 0;
	static int popped = 0;
	public static void main(String[] args) {
		Stack2 s = new Stack2();
		s.stackPush(15);
		s.stackPush(6);
		s.stackPush(2);
		s.stackPush(9);
		s.stackPrint();
		System.out.println();System.out.println("Add 2 more elements");
		s.stackPush(17);
		s.stackPush(3);
		s.stackPrint();
		System.out.println();
		s.stackPop();
		System.out.println("Pop element at top of stack");
		s.stackPrint();
		System.out.println();
		System.out.println("Number popped is: "+popped);

	}
	
	public boolean stackEmpty(){
		if(top == 0){
			return true;
		}else
			return false;
	}
	
	public boolean stackFull(){
		if(top == arr.length){
			return true;
		}else 
			return false;
	}
	
	public int stackPop(){
		if(stackEmpty()){
			System.out.println("Nothing left in Stack!!!");
		}else{
			top = top-1;				//move top back to most recent filled place
			popped = arr[top];			//assign int at top of array to return integer variable popped
			arr[top] = 0;				//and make the top of stack 0, and it is the next available free place
		}
		return popped;
	}
	
	public void stackPush(int x){
		if(stackFull()){
			System.out.println("No more room in stack!!!");
		}else{
			arr[top] = x;				//put the input into this available place
			top = top+1;				//and move the top variable up to next available free place
		}
	}
	
	public void stackPrint(){
		for(int i = 0; i < arr.length; i++){
			System.out.printf("%d ,", arr[i]);
		}
	}
}
