package cct.com.sem5;
public class bubbleSortBrett
{
   int[] myArray =  {7, 8, 90, 10, 11, 5, 12, 56, 84, 4};
   public bubbleSortBrett()
    {
        int n = myArray.length;
        System.out.print("Original Array: ");
        printArray();
        // The outside loop goes over the array <again>. How many times? Length of the array - 1 times.
        for (int i=0; i < n-1; i++) {  // count how many times
            // The inside loop goes over the array elements
            for (int j=0; j < n-1-i; j++) {
                //decide if we need to swap these two elements
                if(myArray[j] > myArray[j+1]){
                    swap(j, j+1);
                }//end if
            }//end inner for
            System.out.print("After pass " + i +": ");
            printArray();
        }//end outer for
        System.out.print("Final Array: ");
        printArray();
    }//end BubbleSort() method
	
    //define printArray method which prints the whole array
    public void printArray(){
        for(int x=0; x < myArray.length; x++){
            System.out.print(" " + myArray[x]);
        }
        System.out.println();
    }

    //define swap method which swaps the positions of x and y
    public void swap(int x, int y){
        int temp = myArray[x];
        myArray[x] = myArray[y]; 
        myArray[y] = temp;
    }

    public static void main(String[]args){
        new bubbleSortBrett();
    }
}