package com.gildedrose;

class GildedRose {
    //ALSO DO NOT TOUCH THIS.
    Item[] items;
    private final QualityUpdater qualityUpdater;

    public GildedRose(Item[] items) {
        qualityUpdater = new SimpleQualityUpdater();
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++){
            items[i] = qualityUpdater.update(items[i]);
        }
    }
}
