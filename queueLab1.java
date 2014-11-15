package cct.com.sem5;
public class queueLab1 {

	static int [] array1 = new int [6];
	static int tail = 0;
	static int temp;
	
	public static void main(String[] args) {
		queueEmpty();
		System.out.println("Enqueue 5 ");
		queueEnqueue(1);
		queueEnqueue(2);
		queueEnqueue(3);
		queueEnqueue(4);
		queueEnqueue(5);
		queuePrint();
		System.out.println("Dequeue 3");
		queueDequeue();
		queueDequeue();
		queueDequeue();
		queuePrint();
		System.out.println("Enqueue 2 ");
		queueEnqueue(7);
		queueEnqueue(8);
		queuePrint();
		System.out.println("Dequeue 2");
		queueDequeue();
		queueDequeue();
		queuePrint();
		System.out.println("Enqueue 1 ");
		queueEnqueue(9);
		queuePrint();
		System.out.println("Enqueue 1 ");
		queueEnqueue(10);
	}
	
	public static boolean queueEmpty(){
		if(tail == 0){
			System.out.println("Queue is empty!!");
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean queueFull(){
		if(tail == array1.length-1){
			System.out.println("Queue is full!!");
			return true;
		}else{
			return false;
		}
	}
	
	public static void queueEnqueue(int queue){
		if(queueFull()){
			System.out.println("No more room in queue!!");
		}else{
			array1[tail] = queue;
			tail++;
		}
	}
	
	public static void queueDequeue(){
		if(queueEmpty()){
			System.out.println("Nothing in queue to dequeue!!");
		}else{
			for(int i = 0;i < array1.length-1; i++){				
				array1[i] = array1[i+1];
			}
			tail--;
		}
	}
	
	public static void queuePrint(){
		for(int i =0; i < array1.length-1; i++){
			System.out.print(array1[i]+" ,");
		}
		System.out.println("");
	}
}
