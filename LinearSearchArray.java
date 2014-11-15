package cct.com.sem5;

public class LinearSearchArray {
						  //0,1,2,3,4,5,6,7,8, 9, 10,11,12,13,14,15,16,17,18,19,20
	static int [] array2 = {3,6,5,9,4,7,8,1,10,20,17,14,13,19,21, 2,11,15,16,18,12};
	static int loc = 0;
	
	public static void main (String [] args){
		searchMoveOneForward(4);
		System.out.println(System.currentTimeMillis());
		searchMoveOneForward(7);
		System.out.println(System.currentTimeMillis());
		searchMoveOneForward(6);
		System.out.println(System.currentTimeMillis());
		searchMoveOneForward(4);
		searchMoveOneForward(12);
		System.out.println(System.currentTimeMillis());
		searchMoveOneForward(3);
		searchMoveOneForward(5);
	}
	
	public static void searchMoveOneForward(int searchField){
		
		while(loc < array2.length && array2[loc] != searchField){
			loc = loc+1;
		}if(loc == array2.length){
			loc = loc-1;
		}else{
			int temp = array2[loc];
				array2[loc] = array2[loc-1];
				array2[loc-1] = temp;
			}
		
		 	for(int i = 0; i < array2.length; i++){
				 System.out.print(array2[i]+", ");
			 }
			 System.out.println();
			 System.out.println("Number "+searchField+" found at index :"+loc);
			 loc = 1;
	}

}
