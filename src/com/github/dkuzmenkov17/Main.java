package com.github.dkuzmenkov17;

import com.github.dkuzmenkov17.iterators.SortedIterator;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Iterator<Integer> firstIterator = Arrays.asList(1, 3, 5, 7, 9).iterator();
        Iterator<Integer> secondIterator = Arrays.asList(0, 2, 4, 6, 8).iterator();
        SortedIterator sortedIterator = new SortedIterator(firstIterator, secondIterator);

        while (sortedIterator.hasNext()) {
            System.out.println(sortedIterator.next());
        }
    }
}
