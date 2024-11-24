import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String str = Arrays.toString(arr);
        System.out.println(str);  
        int index = Arrays.binarySearch(arr, 3);
        System.out.println(index);  
        
        int notFoundIndex = Arrays.binarySearch(arr, 6); 
        System.out.println(notFoundIndex);  
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.equals(arr1, arr2)); 
        System.out.println(Arrays.equals(arr1, arr3));  
        System.out.println(Arrays.compare(arr1, arr2));  
        System.out.println(Arrays.compare(arr1, arr3));  
        int[] arrsort = {5, 3, 8, 1, 2};
        Arrays.sort(arrsort);
        System.out.println(Arrays.toString(arrsort));
    }
}

