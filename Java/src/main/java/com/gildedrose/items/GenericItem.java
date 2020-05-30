package com.gildedrose.items;

import com.gildedrose.Item;

public class GenericItem implements UpdateableQuality {

    private Item item;

    public GenericItem(Item item) {
        this.item = item;
    }

    @Override
    public Item update() {
        return null;
    }
}
