package com.github.dkuzmenkov17.iterators;

import java.util.Iterator;

public class PeekingIterator {

    private final Iterator<Integer> iterator;
    private Integer temp;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public Integer peek() {
        if (temp == null) {
            temp = iterator.next();
        }
        return temp;
    }

    public boolean hasNext() {
        return iterator.hasNext() || temp != null;
    }

    public Integer next() {
        if (temp != null) {
            Integer value = temp;
            temp = null;
            return value;
        }
        return iterator.next();
    }
}
