package com.github.dkuzmenkov17.iterators;

import java.util.Iterator;

public class SortedIterator {

    private final PeekingIterator firstIterator;
    private final PeekingIterator secondIterator;

    public SortedIterator(Iterator<Integer> firstIterator, Iterator<Integer> secondIterator) {
        this.firstIterator = new PeekingIterator(firstIterator);
        this.secondIterator = new PeekingIterator(secondIterator);
    }

    public boolean hasNext() {
        return firstIterator.hasNext() || secondIterator.hasNext();
    }

    public Integer next() {
        if (!firstIterator.hasNext()) {
            return secondIterator.next();
        }
        if (!secondIterator.hasNext()) {
            return firstIterator.next();
        }

        Integer firstIteratorValue = firstIterator.peek();
        Integer secondIteratorValue = secondIterator.peek();
        return firstIteratorValue.compareTo(secondIteratorValue) < 0 ? firstIterator.next() : secondIterator.next();
    }
}
