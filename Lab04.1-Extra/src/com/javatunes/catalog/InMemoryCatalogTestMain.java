/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.Collection;

class InMemoryCatalogTestMain {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {

        InMemoryCatalog catalog = new InMemoryCatalog();

        // testFindById();
        // testFindByKeyword();
        // testFindByCategory();
        // testSize();
         testGetAll();
    }

    private static void testGenreCount() {

    }

    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        MusicItem itemFound = catalog.findById(6L);
        System.out.println(itemFound);

        MusicItem itemNotFound = catalog.findById(19L);
        System.out.println(itemNotFound);
    }

    private static void testFindByKeyword() {
    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);
        dump(items);
    }

    private static void testSize() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println("The size of the catalog is: " + catalog.size());
    }

    private static void testGetAll() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> allItems = catalog.getAll();
        dump(allItems);
    }

    // a helper method to dump a Collection<MusicItem> vertically
    private static void dump(Collection<MusicItem> items) {
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }
}