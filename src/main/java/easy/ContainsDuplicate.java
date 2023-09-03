package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /*public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean result = false;
        for (int el : nums) {
            if (!set.add(el)) {
                result = true;
                break;
            }
        }
        return result;
    }*/

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int el : nums) {
            if (!set.add(el)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] arr = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(cd.containsDuplicate(arr));

    }
}
