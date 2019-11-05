package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item>
{

    public int compare(Item compareItem1, Item compareItem2)
    {
       Long compareId1=((Item)compareItem1).getId();
       Long compareId2=((Item)compareItem2).getId();
       return compareId1.compareTo(compareId2);
            
    }

}
