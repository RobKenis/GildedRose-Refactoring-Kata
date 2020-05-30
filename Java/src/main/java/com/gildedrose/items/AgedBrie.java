package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie implements UpdateableQuality {

    private Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public Item update(Item item) {
        return null;
    }
}
