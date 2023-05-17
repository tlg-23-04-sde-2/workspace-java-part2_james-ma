package com.javatunes.catalog;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    // object under test - "fixture"
    private InMemoryCatalog catalog;

    @Before
    public void setUp() throws Exception {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void getRockItemAtSpecifiedPrice_shouldReturnPopulatedCollection_whenMaxPriceInBound() {
        Collection<MusicItem> rockItems = catalog.getRockItemAtSpecifiedPrice(15.0);
        assertEquals(3, rockItems.size());
    }

    @Test
    public void selfTitledAlbum_shouldReturnPopulatedCollection_whenMatchesFound() {
        Collection<MusicItem> selfTitled = catalog.selfTitledAlbums();
        assertEquals(2, selfTitled.size());
    }

    @Test
    public void findByCategory_shouldReturnPopulatedCollection_categoryFound() {
        Collection<MusicItem> popItems = catalog.findByCategory(MusicCategory.POP);
    }

    @Test
    public void findById_shouldReturnNull_idNotFound() {
        MusicItem item = catalog.findById(19L);
        assertNull(item);
    }

    @Test
    public void findById_shouldReturnMusicItemWithThatId_whenIdFound() {
        MusicItem item = catalog.findById(6L);
        assertEquals(6, item.getId().longValue());
    }
}