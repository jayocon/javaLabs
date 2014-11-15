package cct.com.sem5;
public class insertionSortBrett
{
   int[] myArray =  {7, 8, 90, 10, 11, 5, 12, 56, 84, 4};
   public insertionSortBrett()
    {
        int n = myArray.length;
        System.out.print("Original Array: ");
        printArray();
        // The outside loop goes over the array. How many times? Length of the array - 1 times.
        for (int j=1; j < n; j++) { 
            int temp = myArray[j]; // are we happy with where myArray[j] is (for the moment?) 
            int i = j-1;
            // The while loop finds the current correct place for our current item. This will be determined by its value. Is it less than the element after it? 
            while(i >= 0 && myArray[i] > temp){
                myArray[i+1] = myArray[i];
                i = i-1;
             }//end while
             myArray[i+1] = temp; //put our element in the right place (currently)
             System.out.print("After pass " + j +": ");
             printArray();
        }//end outer for (now all of our "current" correct places should be "final" correct places!)
        System.out.print("Final Array: ");
        printArray();
    }//end SelectionSort() method
	
    //define printArray method which prints the whole array
    public void printArray(){
        for(int x=0; x < myArray.length; x++){
            System.out.print(" " + myArray[x]);
        }
        System.out.println();
    }

    public static void main(String[]args){
        new insertionSortBrett();
    }
}