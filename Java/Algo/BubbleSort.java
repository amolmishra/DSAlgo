// "static void main" must be defined in a public class.
// Bubble Sort
public class BubbleSort {
    public static void main(String[] args) {
        
        int [] intArray = {20, 35, -15, 7, 55, 1, -22};
        
        for (int unsortedIndex = intArray.length-1; unsortedIndex > 0 ; unsortedIndex--) {
            for ( int i = 0 ; i < unsortedIndex; i++) {
                if(intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                }
            }
            for(int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i] + "|");
            }
            System.out.println();
        }
        
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
       
    }

    // Swap the elements at indices i and j in intArray[]
    private static void swap(int[] intArray, int i, int j) {
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}