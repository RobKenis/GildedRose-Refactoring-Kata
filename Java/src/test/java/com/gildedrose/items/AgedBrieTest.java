package com.gildedrose.items;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgedBrieTest {

    @Test
    void update() {
        final AgedBrie brie = new AgedBrie(new Item("Aged Brie", 10, 10));
        final Item item = brie.update();
        assertEquals(11, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    void neverHigherThan50() {
        final AgedBrie brie = new AgedBrie(new Item("Aged Brie", 10, 50));
        final Item item = brie.update();
        assertEquals(50, item.quality);
        assertEquals(9, item.sellIn);
    }
}
