package easy;

public class BinarySearch {
    public int search(int[] input, int key) {
        int result = -1;
        int lowerBound = 0;
        int upperBound = input.length -1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (input[curIn] == key) {
                result = curIn;
                return result;
            } else if (lowerBound > upperBound) {
                return result;
            } else {
                if (input[curIn] < key) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public int searchBound(int[] input, int key, int begin, int last) {
        int result = -1;
        int lowerBound = begin;
        int upperBound = last;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (input[curIn] == key) {
                result = curIn;
                return result;
            } else if (lowerBound > upperBound) {
                return result;
            } else {
                if (input[curIn] < key) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }
}
