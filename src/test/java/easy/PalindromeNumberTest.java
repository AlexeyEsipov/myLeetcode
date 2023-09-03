package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void when100ThenNo() {
        PalindromeNumber pn = new PalindromeNumber();
        assertThat(pn.isPalindrome(-100)).isFalse();
        assertThat(pn.isPalindrome(100)).isFalse();
        assertThat(pn.isPalindrome(-111)).isFalse();
        assertThat(pn.isPalindrome(10)).isFalse();
        assertThat(pn.isPalindrome(11)).isTrue();
        assertThat(pn.isPalindrome(111)).isTrue();
        assertThat(pn.isPalindrome(0)).isTrue();
    }
}