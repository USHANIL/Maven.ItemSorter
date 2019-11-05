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
    /*
    Collection<Item> coll;

    public IdComparator() {
        coll = new LinkedList<Item>();
    }  */

   /*public int compareTo(Item compareItem)
    {
        Long compareId=((Item)compareItem).getId();
        return 0;     //need to change
    }*/

   
    public int compare(Item compareItem1, Item compareItem2)
    {
       Long compareId1=((Item)compareItem1).getId();
       Long compareId2=((Item)compareItem2).getId();
       if (compareId1>compareId2)
           return 1;
       else if (compareId1 < compareId2)
           return -1;
       else
           return 0;
       
    }

}
