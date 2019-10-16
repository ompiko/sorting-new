package sorting;
/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String a[]) {
        int[] arr1 = {93, 69, 99, 46, 27, 21, 26};
        System.out.print("Before Selection Sort: ");
        Sorting.display(arr1);
        System.out.println("");
        
        System.out.print("After Process Sort: ");
        Sorting.selectionSort(arr1);//sorting array using selection sort  
        Sorting.display(arr1);
    }
}
