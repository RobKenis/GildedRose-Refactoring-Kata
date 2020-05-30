package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured implements UpdateableQuality {

    private Item item;

    public Conjured(Item item) {
        this.item = item;
    }

    @Override
    public Item update() {
        if (item.sellIn <= 0){
            int quality = item.quality <= 3 ? 0 : item.quality - 4;
            return new Item(item.name, item.sellIn -1, quality);
        }
        int quality = item.quality <= 1 ? 0 : item.quality - 2;
        return new Item(item.name, item.sellIn -1, quality);
    }
}
