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
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
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
        System.out.println("After Selection Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String a[]) {
        int[] arr1 = {93, 69, 99, 46, 27, 21, 26};
        System.out.println("Before Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        selectionSort(arr1);//sorting array using selection sort  
        display(arr1);
    }
}
