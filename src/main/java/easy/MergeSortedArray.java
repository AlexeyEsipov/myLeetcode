package easy;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should
 * be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1c = m - 1;
        int n2c = n - 1;
        if (m == 0) {
            int j = 0;
            for (int i : nums2) {
                nums1[j] = nums2[j++];
            }
            return;
        }
        for (int i = n + m - 1; i > -1; i--) {
            if (n2c < 0 && n1c >= 0) {
                break;
            }
            if (n1c < 0 && n2c >= 0) {
                nums1[i] = nums2[n2c--];
            }
            if (n1c >= 0) {
                if (nums1[n1c] > nums2[n2c]) {
                    nums1[i] = nums1[n1c--];
                } else {
                    nums1[i] = nums2[n2c--];
                }
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;
        msa.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        nums1 = new int[]{1};
        nums2 = new int[]{};
        m = 1;
        n = 0;
        msa.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        nums1 = new int[]{0};
        nums2 = new int[]{1};
        m = 0;
        n = 1;
        msa.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        nums1 = new int[]{2, 0};
        nums2 = new int[]{1};
        m = 1;
        n = 1;
        msa.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        nums1 = new int[]{2, 3, 0};
        nums2 = new int[]{1};
        m = 2;
        n = 1;
        msa.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        nums1 = new int[]{2, 3, 0, 0};
        nums2 = new int[]{0, 1};
        m = 2;
        n = 2;
        msa.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        nums1 = new int[]{0,0,0,0,0};
        nums2 = new int[]{1,2,3,4,5};
        m = 0;
        n = 5;
        msa.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
