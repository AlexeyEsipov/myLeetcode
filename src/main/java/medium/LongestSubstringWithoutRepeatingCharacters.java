package medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

                int maxLength = 0;
                Set<Character> charSet = new HashSet<>();
                int left = 0;
                for (int right = 0; right < s.length(); right++) {
                    char charRight = s.charAt(right);
                    if (!charSet.contains(charRight)) {
                        charSet.add(charRight);
                        maxLength = Math.max(maxLength, right - left + 1);
                    } else {
                        while (charSet.contains(charRight)) {
                            charSet.remove(s.charAt(left));
                            left++;
                        }
                        charSet.add(charRight);
                    }
                }
                return maxLength;





        /*int result = 0;
        char[] arr = s.toCharArray();
        boolean notsome = true;*/
        /*for (int i = 0; i < arr.length - 1; i++) {
            if (arr.length > 0 && arr[i] == arr[i + 1]) {
                if (result == 0) {
                    result = 1;
                }
                notsome = false;
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if ((j - i) > result) {
                        result = j - i;
                    }
                    notsome = false;
                    break;
                }
            }
        }
        if (s.length() == 0 || s.length() == 1 || notsome) {
            result = s.length();
        }*/


        /*for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]) {
                    if ((j - i) > result) {
                        result = j - i;
                    }
                    notsome = false;
                    break;
                }
            }
        }
        if (s.length() == 0 || s.length() == 1 || notsome) {
            result = s.length();
        }*/
        /*int index = 0;
        int start = 0;
        int end = 0;
        int len = arr.length;
        int currentLen = 1;
        int lastFindLen = 0;
        if (len == 0 || len == 1 || (len == 2 && arr[0] != arr[1])) {
            return len;
        }
        index = 1;
        while(index < arr.length) {
            if (index > 0 && arr[index] != arr[start]) {
                currentLen++;
                index++;
                continue;
            }
            if (index > 0 && arr[index] == arr[start]) {
                //currentLen++;
                if (result < currentLen) {
                    result = currentLen;
                    currentLen = 0;
                }
                start = index - 1;

            }
            index++;

        }
        return result;*/
    }
}
