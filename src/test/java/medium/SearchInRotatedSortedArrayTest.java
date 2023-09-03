package medium;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SearchInRotatedSortedArrayTest {
    @Test
    void when2() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{4,5,6,7,0,1,2};
        assertThat(sArr.search(input, 6)).isEqualTo(2);
    }

    @Test
    void when0() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{4,5,6,7,0,1,2};
        assertThat(sArr.search(input, 4)).isZero();
    }

    @Test
    void when1() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{4,5,6,7,0,1,2};
        assertThat(sArr.search(input, 5)).isEqualTo(1);
    }

    @Test
    void when3() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{4,5,6,7,0,1,2};
        assertThat(sArr.search(input, 7)).isEqualTo(3);
    }

    @Test
    void when4() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{4,5,6,7,0,1,2};
        assertThat(sArr.search(input, 0)).isEqualTo(4);
    }

    @Test
    void when5() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{4,5,6,7,0,1,2};
        assertThat(sArr.search(input, 1)).isEqualTo(5);
    }

    @Test
    void when6() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{4,5,6,7,0,1,2};
        assertThat(sArr.search(input, 2)).isEqualTo(6);
    }
    //@Disabled
    @Test
    void whenNot() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{4,5,6,7,0,1,2};
        assertThat(sArr.search(input, 3)).isEqualTo(-1);
    }

    @Test
    void whenNotInRange() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{4,5,6,8,0,1,2};
        assertThat(sArr.search(input, 7)).isEqualTo(-1);
    }

    @Test
    void whenNotInRangeRight() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{4,5,6,8,0,1,3};
        assertThat(sArr.search(input, 2)).isEqualTo(-1);
    }

    @Test
    void whenSort0() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{1,2,3,4,5,6,7};
        assertThat(sArr.search(input, 1)).isZero();
    }

    @Test
    void whenSort1() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{1,2,3,4,5,6,7};
        assertThat(sArr.search(input, 2)).isEqualTo(1);
    }

    @Test
    void whenSort2() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{1,2,3,4,5,6,7};
        assertThat(sArr.search(input, 3)).isEqualTo(2);
    }

    @Test
    void whenSort3() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{1,2,3,4,5,6,7};
        assertThat(sArr.search(input, 4)).isEqualTo(3);
    }

    @Test
    void whenSort4() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{1,2,3,4,5,6,7};
        assertThat(sArr.search(input, 5)).isEqualTo(4);
    }

    @Test
    void whenSort5() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{1,2,3,4,5,6,7};
        assertThat(sArr.search(input, 6)).isEqualTo(5);
    }

    @Test
    void whenSort6() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{1,2,3,4,5,6,7};
        assertThat(sArr.search(input, 7)).isEqualTo(6);
    }

    @Test
    void whenSortHigh() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{1,2,3,4,5,6,7};
        assertThat(sArr.search(input, 8)).isEqualTo(-1);
    }

    @Test
    void whenSortLow() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{1,2,3,4,5,6,7};
        assertThat(sArr.search(input, -10)).isEqualTo(-1);
    }

    //    @Disabled
    @Test
    void whenNot5() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{4,5,6,0,1};
        assertThat(sArr.search(input, 3)).isEqualTo(-1);
    }

    @Test
    void whenOneEl() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{1};
        assertThat(sArr.search(input, 0)).isEqualTo(-1);
    }

    @Test
    void whenTwoEl() {
        SearchInRotatedSortedArray sArr = new SearchInRotatedSortedArray();
        int[] input = new int[]{3,1};
        assertThat(sArr.search(input, 0)).isEqualTo(-1);
    }
}