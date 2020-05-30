package com.gildedrose.items;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConjuredTest {

    @Test
    void update() {
        final Conjured conjured = new Conjured(new Item("Conjured vest", 10, 10));
        final Item item = conjured.update();
        assertEquals(9, item.sellIn);
        assertEquals(8, item.quality);
    }

    @Test
    void sellByPassed() {
        final Conjured conjured = new Conjured(new Item("Conjured vest", -1, 10));
        final Item item = conjured.update();
        assertEquals(-2, item.sellIn);
        assertEquals(6, item.quality);
    }

    @Test
    void neverNegative() {
        final Conjured conjured = new Conjured(new Item("Conjured vest", 10, 2));
        final Item item = conjured.update();
        assertEquals(9, item.sellIn);
        assertEquals(0, item.quality);
    }
}
