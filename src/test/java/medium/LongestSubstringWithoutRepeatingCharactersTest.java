package medium;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    void    whenThen() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
    }

    @Test
    void    whenThenABCABCABC() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("abcabcabc")).isEqualTo(3);
    }

    @Test
    void    whenThen1() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("bbbb")).isEqualTo(1);
    }

    @Test
    void    whenThen2() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
    }

    @Test
    void    whenThenAU() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("pw")).isEqualTo(2);
    }

    @Test
    void    whenThenA() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("a")).isEqualTo(1);
    }

    @Test
    void    whenThenEmpty() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("")).isZero();
    }

    @Test
    void    whenThenAAB() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("aab")).isEqualTo(2);
    }

    @Test
    void    whenThenAA() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("aa")).isEqualTo(1);
    }

    @Test
    void    whenThenAB() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("ab")).isEqualTo(2);
    }

    @Test
    void    whenThenABB() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("abb")).isEqualTo(2);
    }

    @Test
    void    whenThenAABB() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("aabb")).isEqualTo(2);
    }

    @Test
    void    whenThenBBB() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("bbb")).isEqualTo(1);
    }

    @Test
    void    whenThenBAA() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        assertThat(longest.lengthOfLongestSubstring("baa")).isEqualTo(2);
    }
}