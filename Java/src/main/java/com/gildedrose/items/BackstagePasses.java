package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePasses implements UpdateableQuality {

    private Item item;

    public BackstagePasses(Item item) {
        this.item = item;
    }

    @Override
    public Item update() {
        if (item.sellIn <= 0) {
            //TODO: Generify this.
            return new Item(item.name, item.sellIn - 1, 0);
        }
        if (item.sellIn <= 5) {
            int quality = item.quality == 50 ? 50 : item.quality + 3;
            return new Item(item.name, item.sellIn - 1, quality);

        }
        if (item.sellIn <= 10) {
            int quality = item.quality == 50 ? 50 : item.quality + 2;
            return new Item(item.name, item.sellIn - 1, quality);
        }
        int quality = item.quality == 50 ? 50 : item.quality + 1;
        return new Item(item.name, item.sellIn - 1, quality);
    }
}
