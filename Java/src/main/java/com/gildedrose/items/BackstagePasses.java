package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePasses implements UpdateableQuality {

    private Item item;

    public BackstagePasses(Item item) {
        this.item = item;
    }

    @Override
    public Item update(Item item) {
        return null;
    }
}
