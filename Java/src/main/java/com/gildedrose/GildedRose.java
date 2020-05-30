package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    //ALSO DO NOT TOUCH THIS.
    Item[] items;
    private final QualityUpdater qualityUpdater;

    public GildedRose(Item[] items) {
        qualityUpdater = new SimpleQualityUpdater();
        this.items = items;
    }

    public void updateQuality() {
        items = Arrays.stream(this.items)
                .map(qualityUpdater::update)
                .toArray(item -> new Item[items.length]);
    }
}
