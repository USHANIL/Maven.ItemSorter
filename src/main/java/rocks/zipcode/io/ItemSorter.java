package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] items;

    public ItemSorter(Item[] inpItems)
    {
        this.items = inpItems;
    }

    public Item[] sort(Comparator<Item> comparator) {

        Arrays.sort(items,comparator);
        return items;
    }
}
