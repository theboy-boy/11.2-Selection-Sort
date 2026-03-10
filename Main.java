public class Main {
    public static void main(String[] args) {
        int[] array = {29, 10, 14, 37, 13, 17, 90, 6, 1, 73};
        System.out.println("Original Array: ");
        printArray(array);
        
        selectionSort(array);
        
        System.out.println("Sorted Array: ");
        printArray(array);
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++){
            int savedIndex = i;
            for (int t = i+1; t < array.length; t++){
                if (array[t] < array[savedIndex]){
                    savedIndex = t;
                }
            }
            int tempValue=array[i];
            array[i]=array[savedIndex];
            array[savedIndex]=tempValue;
        }
        
    }
}