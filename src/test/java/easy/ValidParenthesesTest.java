package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void whenOk() {
        String s = "({})[]";
        ValidParentheses vps = new ValidParentheses();
        assertThat(vps.isValid(s)).isTrue();
    }

    @Test
    void whenNotOk() {
        String s = "({[})[]]";
        ValidParentheses vps = new ValidParentheses();
        assertThat(vps.isValid(s)).isFalse();
    }

    @Test
    void whenNotOkE() {
        String s = "]";
        ValidParentheses vps = new ValidParentheses();
        assertThat(vps.isValid(s)).isFalse();
    }

}