package medium;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lowerBound = 0;
        int upperBound = matrix.length -1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (contains(matrix[curIn], target)) {
                return search(matrix[curIn], target);
            } else if (lowerBound > upperBound) {
                return false;
            } else {
                if (matrix[curIn][matrix[curIn].length-1] <= target) {
                    lowerBound = curIn + 1;
                } else if (matrix[curIn][0] >= target){
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public boolean search(int[] input, int target) {
        int lowerBound = 0;
        int upperBound = input.length -1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (input[curIn] == target) {
                return true;
            } else if (lowerBound > upperBound) {
                return false;
            } else {
                if (input[curIn] < target) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public boolean contains(int[] input, int target) {
        if (input.length == 0) {
            return false;
        }
        return input[0] <= target && target <= input[input.length-1];
    }

    public int upNotEmpty(int[][] matrix, int curIn) {
        while (++curIn < matrix.length) {
            if (matrix[curIn].length != 0) {
                return curIn;
            }
        }
        return -1;
    }

    public int downNotEmpty(int[][] matrix, int curIn) {
        while (--curIn >= 0) {
            if (matrix[curIn].length != 0) {
                return curIn;
            }
        }
        return -1;
    }
}
