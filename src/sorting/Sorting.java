package sorting;

/**
 *
 * @author ASUS
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index  
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
