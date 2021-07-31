package 排序算法;
//希尔排序
public class ShellSort {
    public void shellSort(int[] arr) {
        int temp = 0;
        double d1=arr.length;

        while (true) {
             d1 = (int)Math.ceil(d1/2);
             int d = (int) d1;
            for (int i = 0; i < d; i++) {
                //插入排序
                for (int j = i + d; j < arr.length; j += d) {
                    int k = j - d;
                    temp = arr [j];
                    for(; k >= 0 && arr[k] > temp; k -= d) {
                        arr[k+d] = arr[k];
                    }
                    arr[k+d] = temp;
                }
            }
            if (d == 1) {
                break;
            }
        }
    }
}
