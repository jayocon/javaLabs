package cct.com.sem5;

public class Queue2 {

	int [] arr = new int [6];
	int head;
	int tail;
	
	public static void main(String[] args) {
		Queue2 q = new Queue2();
		q.queueEnqueue(15);
		q.queueEnqueue(6);
		q.queueEnqueue(2);
		q.queueEnqueue(9);
		q.queuePrint();
		System.out.println();
		System.out.println("Dequeue example");
		q.queueDequeue();
		q.queuePrint();
		System.out.println();
		System.out.println("Dequeue rest");
		q.queueDequeue();
		q.queuePrint();
		System.out.println();
		q.queueDequeue();
		q.queuePrint();
		System.out.println();
		q.queueDequeue();
		q.queuePrint();
		System.out.println();
		System.out.println("Dequeue again");
		q.queueDequeue();
		System.out.println("Fill queue");
		q.queueEnqueue(15);
		q.queueEnqueue(6);
		q.queueEnqueue(2);
		q.queueEnqueue(9);
		q.queueEnqueue(17);
		q.queueEnqueue(3);
		q.queuePrint();
		System.out.println();
		System.out.println("Enqueue one more");
		q.queueEnqueue(9);
	}
	
	public boolean queueEmpty(){
		if(tail == 0){
			return true;
		}else
			return false;
	}
	
	public boolean queueFull(){
		if(tail == arr.length){
			return true;
		}else
			return false;
	}

	public void queueEnqueue(int x){
		if(queueFull()){
			System.out.println("Queue is full!!!");
		}else
			arr[tail] = x;
			tail = tail +1;
	}

	public int queueDequeue(){
		if(queueEmpty()){
			System.out.println("Queue is empty!!!");
		}else{
			head = arr[0];
			for(int i = 0; i < arr.length-1; i++){
				arr[i] = arr[i+1];
			}
			tail = tail -1;
		}
		return head;
	}
	
	public void queuePrint(){
		for(int i = 0; i < arr.length; i++){
			System.out.printf("%d ,",arr[i]);
		}
	}
}
