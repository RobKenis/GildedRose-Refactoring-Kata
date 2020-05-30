package com.gildedrose.items;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackstagePassesTest {

    @Test
    void update() {
        final BackstagePasses pass = new BackstagePasses(new Item("Backstage passes for Rob", 20, 10));
        final Item item = pass.update();
        assertEquals(19, item.sellIn);
        assertEquals(11, item.quality);
    }

    @Test
    void neverMoreThan50() {
        final BackstagePasses pass = new BackstagePasses(new Item("Backstage passes for Rob", 20, 50));
        final Item item = pass.update();
        assertEquals(19, item.sellIn);
        assertEquals(50, item.quality);
    }

    @Test
    void lessThan10Days() {
        final BackstagePasses pass = new BackstagePasses(new Item("Backstage passes for Rob", 9, 10));
        final Item item = pass.update();
        assertEquals(8, item.sellIn);
        assertEquals(12, item.quality);
    }

    @Test
    void lessThan5Days() {
        final BackstagePasses pass = new BackstagePasses(new Item("Backstage passes for Rob", 3, 10));
        final Item item = pass.update();
        assertEquals(2, item.sellIn);
        assertEquals(13, item.quality);
    }

    @Test
    void concertHassPassed() {
        final BackstagePasses pass = new BackstagePasses(new Item("Backstage passes for Rob", 0, 10));
        final Item item = pass.update();
        assertEquals(-1, item.sellIn);
        assertEquals(0, item.quality);
    }
}
