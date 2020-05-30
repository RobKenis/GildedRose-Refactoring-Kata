package com.gildedrose.items;

import com.gildedrose.Item;

public class Sulfuras implements UpdateableQuality {

    private Item item;

    public Sulfuras(Item item) {
        this.item = item;
    }

    @Override
    public Item update() {
        return null;
    }
}
