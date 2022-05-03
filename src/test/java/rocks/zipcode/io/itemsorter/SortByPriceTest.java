package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {
    @Test
    public void test1(){
        Item item1 = new Item(1L, "Apple", 2.0);
        Item item2 = new Item(2L, "Banana", 1.5);
        Item item3 = new Item(3L, "Orange", 3.0);
        Item[] items = {item1, item2, item3};
        Item[] expected = {item2, item1, item3};
        ItemSorter itemSorter = new ItemSorter(items);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        Item[] actual = itemSorter.sort(comparator);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void test2(){
        Item item1 = new Item(4L, "Apple", 2.0);
        Item item2 = new Item(5L, "Banana", 1.5);
        Item item3 = new Item(6L, "Orange", 3.0);
        Item[] items = {item1, item2, item3};
        Item[] expected = {item2, item1, item3};
        ItemSorter itemSorter = new ItemSorter(items);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        Item[] actual = itemSorter.sort(comparator);
        Assert.assertArrayEquals(expected, actual);

    }
    @Test
    public void test3(){
        Item item1 = new Item(7L, "Apple", 2.0);
        Item item2 = new Item(8L, "Banana", 3.5);
        Item item3 = new Item(9L, "Orange", 3.0);
        Item[] items = {item1, item2, item3};
        Item[] expected = {item1, item3, item2};
        ItemSorter itemSorter = new ItemSorter(items);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        Item[] actual = itemSorter.sort(comparator);
        Assert.assertArrayEquals(expected, actual);

    }

}
