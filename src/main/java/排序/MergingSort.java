package 排序;
//归并排序
public class MergingSort {
    public void mergingSort(int[] arr, int left, int right) {
        if (left < right) {
            int center = (left+right)/2;
            mergingSort(arr,left,center);
            mergingSort(arr,center+1,right);
            merge(arr,left,center,right);
        }
    }
    public void merge(int[] arr, int left, int center, int right) {
        int[] tempArr = new int[arr.length];
        int mid = center+1;
        //记录中间数组的索引
        int third = left;
        int temp = left;
        while(left <= center && mid <= right) {
            //从两个数组中找出最小的数放入中间数组
            if (arr[left] <= arr[mid]) {
                tempArr[third++] = arr[left++];
            }
            else {
                tempArr[third++] = arr[mid++];
            }
        }
        //剩余部分加入数组
        while(mid <= right) {
            tempArr[third++] = arr[mid++];
        }
        while(left <= center) {
            tempArr[third++] = arr[left++];
        }
        //复制数组
        while(temp <= right) {
            arr[temp] = tempArr[temp++];
        }
    }
}
