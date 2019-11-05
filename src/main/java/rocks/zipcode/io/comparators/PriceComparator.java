package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item>
{

    public int compare(Item item1, Item item2)
    {
        Double compareId1=((Item)item1).getPrice();
        Double compareId2=((Item)item2).getPrice();

        return  compareId1.compareTo(compareId2);

    }
}
