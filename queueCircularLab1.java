package cct.com.sem5;
public class queueCircularLab1 {

	static int [] array1 = new int [6];
	static int tail = 0;
	static int head = 0;
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
		System.out.println("Enqueue 1 ");
		queueEnqueue(6);
		queuePrint();
		System.out.println("Dequeue 3");
		queueDequeue();
		queueDequeue();
		queueDequeue();
		queuePrint();
		/*System.out.println("Enqueue 2 ");
		queueEnqueue(7);
		queueEnqueue(8);
		queuePrint();
		System.out.println("Enqueue 1 ");
		queueEnqueue(9);
		queuePrint();
		System.out.println("Enqueue 1 ");
		queueEnqueue(10);*/
	}
	
	public static boolean queueEmpty(){
		if(head == tail){
			System.out.println("Queue is empty!!");
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean queueFull(){
		if(head == tail+1 || (head == 0 
				&& tail == array1.length-1)){
			System.out.println("Queue is full!!");
			return true;
		}else{
			return false;
		}
	}
	
	public static void queueEnqueue(int queue){
		if(queueFull()){
			System.out.println("No more room in queue!!");
		}else if(tail == array1.length-1){
				tail = 0;
			}else{
				array1[tail] = queue;
				tail++;
			}			
		} 
	
	public static void queueDequeue(){
		if(queueEmpty()){
			System.out.println("Nothing in queue to dequeue!!");
		}else{
	
			if(array1[head] == array1.length){
				array1[head] = 0;
			}else{
				for(int i = array1[head]; i <= 1; i++){
				array1[i] = array1[i+1];
				}
				array1[head]++;
			}
		}
	}
	
	public static void queuePrint(){
		for(int i =0; i < array1.length-1; i++){
			System.out.print(array1[i]+" ,");
		}
		System.out.println("");
	}
}
