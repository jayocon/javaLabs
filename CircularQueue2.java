package cct.com.sem5;

public class CircularQueue2 {

	static int [] arr = new int [12];
	static int head;
	static int tail;
	static int dequeued;
	
	public static void main(String[] args) {
		CircularQueue2 cq = new CircularQueue2();
		cq.queueCircularEnqueue(15);
		cq.queueCircularEnqueue(6);
		cq.queueCircularEnqueue(2);
		cq.queueCircularEnqueue(9);
		cq.queueCircularEnqueue(17);
		cq.queueCircularEnqueue(3);
		cq.queueCircularEnqueue(11);
		cq.queueCircularEnqueue(5);
		cq.queueCircularEnqueue(17);
		cq.queueCircularEnqueue(3);
		cq.queueCircularEnqueue(11);
		System.out.println("Enqueue");
		cq.queueCircularPrint();
		
		System.out.println("Dequeue 3");
		cq.queueCircularDequeue();
		cq.queueCircularPrint();
		cq.queueCircularDequeue();
		cq.queueCircularPrint();
		cq.queueCircularDequeue();
		cq.queueCircularPrint();
		
		System.out.println("Enqueue 3 more");
		cq.queueCircularEnqueue(17);
		//cq.queueCircularEnqueue(3);
		//cq.queueCircularEnqueue(11);
		cq.queueCircularPrint();
		
		
		System.out.println("Head of array is: "+arr[head]);
		System.out.println("Tail of array is: "+arr[tail]);
		cq.queueCircularDequeue();
		cq.queueCircularPrint();
		cq.queueCircularDequeue();
		cq.queueCircularPrint();
		cq.queueCircularDequeue();
		cq.queueCircularPrint();
		cq.queueCircularDequeue();
		cq.queueCircularPrint();
		cq.queueCircularDequeue();
		cq.queueCircularPrint();
		cq.queueCircularDequeue();
		cq.queueCircularPrint();
		cq.queueCircularDequeue();
		cq.queueCircularDequeue();
		cq.queueCircularPrint();
		System.out.println("Head of array is: "+arr[head]);
		System.out.println("Tail of array is: "+arr[tail]);
		System.out.println("Head of array is: "+head);
		System.out.println("Tail of array is: "+tail);
	}
	
	public boolean queueEmpty(){
		if(head == tail){
			return true;
		}else
			return false;
	}
	
	public boolean queueFull(){
		if(head == tail + 1 || head == 0 && tail == arr.length -1){
			return true;
		}else
			return false;
	}

	public void queueCircularEnqueue(int x){
		
			arr[tail] = x;
			tail = tail +1;
			if(head != 0 && tail == arr.length-1){
				tail = 0;
			}else if(queueFull()){
				System.out.println("Queue is full!!!");
			}
		}
	
	
	public int queueCircularDequeue(){
		if(queueEmpty()){
			System.out.println("Queue is empty!!!");
		}else{
			arr[head] = 0;
			head = head + 1;
			if(head == arr.length-1){
				head = 0;
			}
			//dequeued = arr[head];
		}
		return dequeued;
	}

	public void queueCircularPrint(){
		for(int i = 0; i < arr.length-1; i++){
			System.out.printf("%d ,", arr[i]);
		}
		System.out.println();
	}
}
