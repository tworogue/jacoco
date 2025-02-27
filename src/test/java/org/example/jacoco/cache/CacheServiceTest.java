package org.example.jacoco.cache;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CacheServiceTest {

    @Test
    void testPutAndGet() {
        CacheService<String, Integer> cache = new CacheService<>();
        cache.put("key1", 100);
        assertEquals(100, cache.get("key1"));
    }

    @Test
    void testRemove() {
        CacheService<String, Integer> cache = new CacheService<>();
        cache.put("key2", 200);
        Integer removedValue = cache.remove("key2");
        assertEquals(200, removedValue);
        assertNull(cache.get("key2"));
    }

    @Test
    void testContainsAndSize() {
        CacheService<String, Integer> cache = new CacheService<>();
        cache.put("key3", 300);
        assertTrue(cache.contains("key3"));
        assertEquals(1, cache.size());
    }

}