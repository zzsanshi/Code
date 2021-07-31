package 排序算法;
//简单排序
public class SelectSort {
    public void selectSort(int[] arr) {
        int position;
        for (int i = 0; i < arr.length ; i++) {
            int j = i + 1;
            position = i;
            int temp = arr[i];
            for(; j < arr.length; j++) {
                if (arr[j] < temp ) {
                    temp = arr[j];
                    position = j;
                }
            }
            //交换
            arr[position] = arr[i];
            arr[i] = temp;
        }
    }
}
