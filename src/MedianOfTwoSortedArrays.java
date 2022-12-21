import java.util.Collections;
import java.util.LinkedList;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0 && nums2.length==0) return 0;
        int[] sorted = sort(merge(nums1,nums2));
        return median(sorted);
    }

    public int[] merge(int[] nums1,int[] nums2){
        int position =0;
        int[] merged = new int[nums1.length+nums2.length];

        for (int item:nums1){
            merged[position] = item;
            position++;
        }

        for (int item2:nums2){
            merged[position] = item2;
            position++;
        }

        return merged;
    }

    public double median(int[] arr){
        if(arr.length%2==0) return (double) (arr[(arr.length/2)-1]+arr[((arr.length/2)+1)-1])/2;
        if(arr.length > 1) return arr[(arr.length/2)];
        return arr[0];
    }

    public int[] sort(int[] arr){
        int i, key, j;
        for (i = 1; i < arr.length; i++)
        {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

    public static void main(String ...args){
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        double median = solution.findMedianSortedArrays(new int[]{},new int[]{1,2,3,4,5});
        System.out.print("<--"+median);
    }
}
