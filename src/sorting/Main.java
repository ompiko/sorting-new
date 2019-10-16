package sorting;
/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String a[]) {
        int[] arr1 = {93, 69, 99, 46, 27, 21, 26};
        System.out.println("Before Selection Sort");
        Sorting.display(arr1);
        System.out.println();
        
        Sorting.selectionSort(arr1);//sorting array using selection sort  
        Sorting.display(arr1);
    }
}
