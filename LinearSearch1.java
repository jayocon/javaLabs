package cct.com.sem5;
import java.util.Random;

public class LinearSearch1 {
	
	public static Random ranGen;
	static int[] array = new int [101];
	
	public static void main(String[] args) {
		
		RandomGenerator();
		printArray();
	}
	
	public static int[] RandomGenerator(){
		ranGen = new Random();
		for(int i = 1; i < 101; i++){
			array[i] = ranGen.nextInt(10);
		}
		return array;
	}
	public static void printArray(){
		 for(int i = 1; i < 101; i++){
			 System.out.print(array[i]+", ");
		 }
	}
	

}
