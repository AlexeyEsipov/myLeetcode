package medium;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Search2DMatrixTest {
    @Test
    void whenContains() {
        Search2DMatrix sd = new Search2DMatrix();
        int[] arr = new int[]{1,2,3,4};
        assertThat(sd.contains(arr, 1)).isTrue();
        assertThat(sd.contains(arr, 0)).isFalse();
        assertThat(sd.contains(arr, 5)).isFalse();
        assertThat(sd.contains(arr, 3)).isTrue();
    }

    @Test
    void whenContainsEmpty() {
        Search2DMatrix sd = new Search2DMatrix();
        int[] arr = new int[]{};
        assertThat(sd.contains(arr, 1)).isFalse();
    }

    @Test
    void whenSearch() {
        Search2DMatrix sd = new Search2DMatrix();
        int[] arr = new int[]{1,2,3,4};
        assertThat(sd.search(arr, 1)).isTrue();
        assertThat(sd.search(arr, 0)).isFalse();
        assertThat(sd.search(arr, 5)).isFalse();
        assertThat(sd.search(arr, 3)).isTrue();
    }

    @Test
    void whenSearchMatrix2Arr() {
        Search2DMatrix sd = new Search2DMatrix();
        int[][] arr = new int[][]{{1,2,3,4}, {6,7,8,9}};
        assertThat(sd.searchMatrix(arr, 1)).isTrue();
        assertThat(sd.searchMatrix(arr, 5)).isFalse();
        assertThat(sd.searchMatrix(arr, 0)).isFalse();
        assertThat(sd.searchMatrix(arr, 15)).isFalse();
        assertThat(sd.searchMatrix(arr, 8)).isTrue();
    }

    @Test
    void whenSearchMatrix3Arr() {
        Search2DMatrix sd = new Search2DMatrix();
        int[][] arr = new int[][]{{1,2,3,4}, {6,7,8,9}, {11,12,13,14}};
        assertThat(sd.searchMatrix(arr, 1)).isTrue();
        assertThat(sd.searchMatrix(arr, 5)).isFalse();
        assertThat(sd.searchMatrix(arr, 0)).isFalse();
        assertThat(sd.searchMatrix(arr, 15)).isFalse();
        assertThat(sd.searchMatrix(arr, 10)).isFalse();
        assertThat(sd.searchMatrix(arr, 12)).isTrue();
        assertThat(sd.searchMatrix(arr, 14)).isTrue();
    }

    @Disabled
    @Test
    void whenSearchMatrix3ArrEmpty() {
        Search2DMatrix sd = new Search2DMatrix();
        int[][] arr = new int[][]{{1,2,3,4}, {}, {11,12,13,14}};
//        assertThat(sd.searchMatrix(arr, 1)).isTrue();
        assertThat(sd.searchMatrix(arr, 5)).isFalse();
        assertThat(sd.searchMatrix(arr, 0)).isFalse();
        assertThat(sd.searchMatrix(arr, 15)).isFalse();
        assertThat(sd.searchMatrix(arr, 10)).isFalse();
        assertThat(sd.searchMatrix(arr, 12)).isTrue();
        assertThat(sd.searchMatrix(arr, 14)).isTrue();
    }

    @Test
    void whenUpNotEmpty() {
        Search2DMatrix sd = new Search2DMatrix();
        int[][] arr = new int[][]{{}, {}, {11}, {}, {1}};
        assertThat(sd.upNotEmpty(arr, 0)).isEqualTo(2);
        assertThat(sd.upNotEmpty(arr, 1)).isEqualTo(2);
        assertThat(sd.upNotEmpty(arr, 2)).isEqualTo(4);
        assertThat(sd.upNotEmpty(arr, 3)).isEqualTo(4);
        assertThat(sd.upNotEmpty(arr, 4)).isEqualTo(-1);
        assertThat(sd.upNotEmpty(arr, 5)).isEqualTo(-1);
    }

    @Test
    void whenDownNotEmpty() {
        Search2DMatrix sd = new Search2DMatrix();
        int[][] arr = new int[][]{{}, {}, {11}, {}, {1}};
        assertThat(sd.downNotEmpty(arr, 4)).isEqualTo(2);
        assertThat(sd.downNotEmpty(arr, 3)).isEqualTo(2);
        assertThat(sd.downNotEmpty(arr, 2)).isEqualTo(-1);
        assertThat(sd.downNotEmpty(arr, 1)).isEqualTo(-1);
        assertThat(sd.downNotEmpty(arr, 0)).isEqualTo(-1);
        assertThat(sd.downNotEmpty(arr, -1)).isEqualTo(-1);
    }

}