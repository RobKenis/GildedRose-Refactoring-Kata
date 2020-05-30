package com.gildedrose.items;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericItemTest {

    @Test
    void update() {
        final GenericItem genericItem = new GenericItem(new Item("Some vest", 10, 10));
        final Item item = genericItem.update();
        assertEquals(9, item.sellIn);
        assertEquals(9, item.quality);
    }

    @Test
    void sellByPassed() {
        final GenericItem genericItem = new GenericItem(new Item("Some vest", -1, 10));
        final Item item = genericItem.update();
        assertEquals(-2, item.sellIn);
        assertEquals(8, item.quality);
    }

    @Test
    void neverNegative() {
        final GenericItem genericItem = new GenericItem(new Item("Some vest", 10, 0));
        final Item item = genericItem.update();
        assertEquals(9, item.sellIn);
        assertEquals(0, item.quality);
    }
}
