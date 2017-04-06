package com.behzad.cache;

/**
 * Created by Behzad Altaf
 */
public interface Cache<U, V> {

    void put(U key, V value);

    V get(U key);
}
