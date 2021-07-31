package 排序算法;

public class QuickSort {
    public static void quickSort(int[] arr,int low,int high) {
        int i,j,key,temp;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        key = arr[low];

        while (i < j) {
            while (key <= arr[j] && i < j) {
                j--;
            }
            while (key >= arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[i];
        arr[i] = key;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
    }
}
