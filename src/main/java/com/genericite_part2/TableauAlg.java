package com.genericite_part2;

public class TableauAlg {
    public static <type extends Comparable<type>> Paire<type> minMax(type[] tab) {
        if (tab.length == 0)
            return null;
        type min = tab[0];
        type max = tab[0];
        for (type element : tab) {
            if (min.compareTo(element) < 0)
                min = element;
            if (max.compareTo(element) > 0)
                max = element;
        }
        return new Paire<type>(min, max);
    }
}
