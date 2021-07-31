package 排序算法;
//插入排序
public class InsertSort {
    public void insertSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length ; i++) {
            int j = i-1;
            temp = arr[i];
            for (; j >= 0 && arr[j] > temp  ; j++) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
}
