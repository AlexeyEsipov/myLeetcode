package easy;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TwoSumTest {

    @Test
    void whenThen() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = new int[]{0, 1};
        assertThat(twoSum.twoSum(nums, target)).isEqualTo(result);
    }

    @Test
    void whenThen1() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 22;
        int[] result = new int[]{1, 3};
        assertThat(twoSum.twoSum(nums, target)).isEqualTo(result);
    }
}