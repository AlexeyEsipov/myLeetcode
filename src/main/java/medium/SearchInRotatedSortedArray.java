package medium;

public class SearchInRotatedSortedArray {
    /*public int search(int[] nums, int target) {
        int result = -1;
        int lowerBound = 0;
        int upperBound = nums.length -1;
        int curIn;
        if (nums.length == 0) {
            return result;
        }
        if (nums.length == 1 && nums[0] != target) {
            return result;
        }
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }
        if (nums.length == 2 ) {
            if (nums[0] == target) {
                return 0;
            }
            if (nums[1] == target) {
                return 1;
            }
            return result;
        }

        if (nums.length == 3 ) {
            if (nums[0] == target) {
                return 0;
            }
            if (nums[1] == target) {
                return 1;
            }
            if (nums[2] == target) {
                return 2;
            }
            return result;
        }



        if (nums[0] < nums[upperBound] && (target < nums[0] || nums[upperBound] < target)) {
                return result;
        }
        if (nums[0] > nums[upperBound] && (target < nums[0] && nums[upperBound] < target)) {
                return result;
        }
        while (true) {
            curIn = (lowerBound + upperBound) / 2; //средний индекс массива
            if (lowerBound > upperBound) {  // если границы пересеклись - то нет такой цели
                return result;  // вернули: минус 1 (-1)
            }
            if (nums[curIn] == target) {  //если нашли
                result = curIn;
                return result;
            }
            // проверяем левую часть на гладкость
            if (nums[lowerBound] < nums[curIn]
                    && ((nums[lowerBound] <= target)
                    && (target <= nums[curIn]))) { // и цель находится в этой стороне
                         // то переходим к этой стороне
                    return searchBound(nums, target, lowerBound, curIn);
            }
            if (nums[curIn] < nums[upperBound]
                    && ((nums[curIn] <= target)
                    && (target <= nums[upperBound]))) { // и цель находится в этой стороне
                         // то переходим к этой стороне
                    return searchBound(nums, target, curIn, upperBound);
            }
            if (nums[lowerBound] > nums[curIn]) {  // левая сторона рваная
                upperBound = curIn - 1;
                continue;
            }
            if (nums[curIn] > nums[upperBound]) { // правая сторона рваная
                lowerBound = curIn + 1;
            }
        }
    }

    private int searchBound(int[] input, int key, int begin, int last) {
        int result = -1;
        int lowerBound = begin;
        int upperBound = last;
        int curIn;
        while (true) {
            if (lowerBound > upperBound) {
                return result;
            }
            curIn = (lowerBound + upperBound) / 2;
            if (input[curIn] == key) {
                return curIn;
            }
            if (input[curIn] < key) {
                lowerBound = curIn + 1;
            } else {
                upperBound = curIn - 1;
            }
        }
    }*/

    public int search(int[] nums, int target) {
        int pivot = pivotSearch(nums);
        int first = bSearch(nums,target,0,pivot);
        if(first == -1){
            first = bSearch(nums,target,pivot+1,nums.length-1);
        }
        return first;
    }
    private int pivotSearch(int[] nums){
        int st = 0;
        int end = nums.length-1;

        while(st<end){
            int mid = st + (end-st)/2;

            if(nums[mid] > nums[mid+1])
                return mid;
            else if(nums[mid] > nums[0])
                st = mid+1;
            else end = mid;
        }
        return nums.length-1;
    }
    private int bSearch(int[] nums,int num , int st , int end){
        while(st<=end){
            int mid = st+(end-st)/2;
            if(num > nums[mid])
                st = mid+1;
            else if(num < nums[mid])
                end = mid-1;
            else return mid;
        }
        return -1;
    }

}
