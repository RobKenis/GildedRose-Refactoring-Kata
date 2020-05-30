package com.gildedrose.items;

import com.gildedrose.Item;

public class GenericItem implements UpdateableQuality {

    private Item item;

    public GenericItem(Item item) {
        this.item = item;
    }

    @Override
    public Item update() {
        if (item.sellIn <= 0){
            int quality = item.quality <= 1 ? 0 : item.quality - 2;
            return new Item(item.name, item.sellIn -1, quality);
        }
        int quality = item.quality == 0 ? 0 : item.quality - 1;
        return new Item(item.name, item.sellIn -1, quality);
    }
}
