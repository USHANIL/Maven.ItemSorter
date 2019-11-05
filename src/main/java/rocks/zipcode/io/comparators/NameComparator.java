package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item>
{
    /*
    public int compareTo(Item o) {
        return 0;
    } */

    public int compare(Item compareItem1, Item compareItem2)
    {
        String compareId1=((Item)compareItem1).getName();
        String compareId2=((Item)compareItem2).getName();
        /*if (compareId1>compareId2)
            return 1;
        else if (compareId1 < compareId2)
            return -1;
        else
            return 0;

         */
        return  compareId1.compareTo(compareId2);

    }
}
