package com.gildedrose.items;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulfurasTest {

    @Test
    void update() {
        final Sulfuras sulfaras = new Sulfuras(new Item("Sulfaras", 10, 10));
        final Item item = sulfaras.update();
        assertEquals(10, item.sellIn);
        assertEquals(10, item.quality);
    }
}
