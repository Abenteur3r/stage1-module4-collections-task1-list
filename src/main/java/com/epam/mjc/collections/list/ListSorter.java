package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aVal = foo(a);
        int bVal = foo(b);
        if (aVal == bVal){
            return a.compareTo(b);
        }
        return Integer.compare(aVal,bVal);
    }
    private int foo(String s){
        int x = Integer.parseInt(s);
        return 5 * x * x +3;
    }
}
