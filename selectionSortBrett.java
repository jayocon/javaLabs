package cct.com.sem5;
public class selectionSortBrett
{
   int[] myArray =  {7, 8, 90, 10, 11, 5, 12, 56, 84, 4};
   public selectionSortBrett()
    {
        int n = myArray.length;
        System.out.print("Original Array: ");
        printArray();
        // The outside loop goes over the array <again>. How many times? Length of the array - 1 times.
        for (int i=0; i < n-1; i++) {  
            int smallestPlace = i; // assume this is the smallest element in the array
            // The inside loop goes through the array, swapping with smallestPlace if necessary
            for (int j=i+1; j < n; j++) {
                //decide if we have the real smallestPlace
                if(myArray[j] < myArray[smallestPlace]){
                    smallestPlace = j;
                }//end if
            }//end inner for
            swap(i, smallestPlace); // swap the real smallest element with the assumed one. (If we assumed right, this does nothing!)
            System.out.print("After pass " + i +": ");
            printArray();
        }//end outer for
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

    //define swap method which swaps the positions of x and y
    public void swap(int x, int y){
        int temp = myArray[x];
        myArray[x] = myArray[y]; 
        myArray[y] = temp;
    }

    public static void main(String[]args){
        new selectionSortBrett();
    }
}