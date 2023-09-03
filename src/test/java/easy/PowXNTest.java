package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PowXNTest {
    @Test
    void when210(){
        PowXN powXN = new PowXN();
        assertThat(powXN.myPow(2.0D, 10)).isEqualTo(1024);
    }
}