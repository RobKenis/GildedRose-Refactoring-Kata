package com.gildedrose;

import com.gildedrose.items.ItemFactory;
import com.gildedrose.items.UpdateableQuality;

class GildedRose {
    //ALSO DO NOT TOUCH THIS.
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++){
            final UpdateableQuality item = ItemFactory.of(items[i]);
            items[i] = item.update();
        }
    }
}
