package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemFactory {

    public static UpdateableQuality of(Item item) {
        if (item.name.equals("Aged Brie")){
            return new AgedBrie(item);
        }
        if (item.name.startsWith("Sulfuras")){
            return new Sulfuras(item);
        }
        if (item.name.startsWith("Backstage passes")){
            return new BackstagePasses(item);
        }
        if (item.name.startsWith("Conjured")){
            return new Conjured(item);
        }
        return new GenericItem(item);
    }

}
