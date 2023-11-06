package easy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
@Disabled
class BestTimeToBuyAndSellStockTest {
    @Test
    void when() {
        BestTimeToBuyAndSellStock best = new BestTimeToBuyAndSellStock();
        assertThat(best.maxProfit(new int[]{7,1,5,3,6,4})).isEqualTo(5);
    }

    @Test
    void whenEmpty() {
        BestTimeToBuyAndSellStock best = new BestTimeToBuyAndSellStock();
        assertThat(best.maxProfit(new int[]{})).isZero();
    }

    @Test
    void whenNull() {
        BestTimeToBuyAndSellStock best = new BestTimeToBuyAndSellStock();
        assertThat(best.maxProfit(null)).isZero();
    }

    @Test
    void whenOld() {
        BestTimeToBuyAndSellStock best = new BestTimeToBuyAndSellStock();
        assertThat(best.maxProfit(new int[]{7,6,4,3,1})).isZero();
    }

}