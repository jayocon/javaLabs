package cct.com.sem5;

public class BinarySearch {

	static int[] array = new int[100001];
	static int start = 0;
	static int end = array.length-1;
	static int mid = array.length/2;
	static int loc;
	
	public static void main(String[] args) {
		getArray();
		binary_Search(34645);

	}
	public static int[] getArray(){
		for(int i = 1; i < array.length;i++){
			array[i] = i;
		}
		return array;
		
	}
	public static int binary_Search(int searchField){
		while(start <= end && array[mid] != searchField){
			if(searchField < array[mid]){
				end = mid -1;
			}else{
				start = mid +1;
			}
			mid = (start + end)/2;
		}
		if(array[mid] == searchField){
			loc = mid;
			System.out.println(System.currentTimeMillis());
		}else{
			loc = -1;
		}
		return loc;
	}

}
