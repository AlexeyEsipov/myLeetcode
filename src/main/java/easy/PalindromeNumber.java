package easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length()/2; i++) {
            if (ch[i] != ch[s.length()-1-i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();

        System.out.println(pn.isPalindrome(-100));
        System.out.println(pn.isPalindrome(100));
        System.out.println(pn.isPalindrome(-111));
        System.out.println(pn.isPalindrome(10));
        System.out.println(pn.isPalindrome(11));
        System.out.println(pn.isPalindrome(111));
        System.out.println(pn.isPalindrome(0));
    }
}
