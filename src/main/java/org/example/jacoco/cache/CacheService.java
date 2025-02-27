package org.example.jacoco.cache;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class CacheService<K, V> {

    private Map<K, V> cache = new HashMap<>();

    public void put(K key, V value) {
        cache.put(key, value);
    }

    public V get(K key) {
        return cache.get(key);
    }

    public V remove(K key) {
        return cache.remove(key);
    }

    public boolean contains(K key) {
        return cache.containsKey(key);
    }

    public int size() {
        return cache.size();
    }
}
