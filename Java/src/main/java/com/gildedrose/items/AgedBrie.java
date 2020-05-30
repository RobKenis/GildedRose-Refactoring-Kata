package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie implements UpdateableQuality {

    private Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public Item update() {
        int quality = item.quality == 50 ? 50 : item.quality +1;
        return new Item(item.name, item.sellIn -1, quality);
    }
}
