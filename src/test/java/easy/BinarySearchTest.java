package easy;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BinarySearchTest {

    @Test
    void when2() {
        BinarySearch bs = new BinarySearch();
        assertThat(bs.search(new int[]{1,2,5,6,7}, 5)).isEqualTo(2);
    }

    @Test
    void when2el() {
        BinarySearch bs = new BinarySearch();
        assertThat(bs.search(new int[]{1,2}, 3)).isEqualTo(-1);
    }

    @Test
    void whenNo() {
        BinarySearch bs = new BinarySearch();
        assertThat(bs.search(new int[]{1,2,5,6,7}, 0)).isEqualTo(-1);
    }

    @Test
    void when1() {
        BinarySearch bs = new BinarySearch();
        assertThat(bs.search(new int[]{1,2,5,6,7}, 2)).isEqualTo(1);
    }

    @Test
    void when0() {
        BinarySearch bs = new BinarySearch();
        assertThat(bs.search(new int[]{1,2,5,6,7}, 1)).isZero();
    }

    @Test
    void when4() {
        BinarySearch bs = new BinarySearch();
        assertThat(bs.search(new int[]{1,2,5,6,7}, 7)).isEqualTo(4);
    }

    @Test
    void when2Bound() {
        BinarySearch bs = new BinarySearch();
        assertThat(bs.searchBound(new int[]{11,5,1,2,5,6,7, -1, -10}, 5, 2, 6)).isEqualTo(4);
    }

}