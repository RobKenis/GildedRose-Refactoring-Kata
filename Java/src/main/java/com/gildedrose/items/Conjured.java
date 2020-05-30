package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured implements UpdateableQuality {

    private Item item;

    public Conjured(Item item) {
        this.item = item;
    }

    @Override
    public Item update(Item item) {
        return null;
    }
}
