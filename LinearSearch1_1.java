package cct.com.sem5;

public class LinearSearch1_1 {
	
	static int [] array2;
	static int loc = 0;
	
	public static void main (String [] args){
		searchMoveOneForward(4);
	}
	
	public static void searchMoveOneForward(int searchField){
		array2 = LinearSearch1.RandomGenerator();
		
		while(loc < array2.length && array2[loc] != searchField){
			loc = loc+1;
		}if(loc == array2.length){
			loc = loc-1;
		}else{
			int temp = array2[loc];
			for(int i = loc; i < 2; i++){
				array2[i] = array2[i-1];
				array2[loc+1] = temp;
			}
		}
			 for(int i = 1; i < 101; i++){
				 System.out.print(array2[i]+", ");
			 }
		
	}

}
