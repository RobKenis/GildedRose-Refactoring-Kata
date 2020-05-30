package com.gildedrose;

import com.gildedrose.items.ItemFactory;
import com.gildedrose.items.UpdateableQuality;

public class SimpleQualityUpdater implements QualityUpdater {
    @Override
    public Item update(Item item) {
        final UpdateableQuality updateableItem = ItemFactory.of(item);
        return updateableItem.update();
    }
}
