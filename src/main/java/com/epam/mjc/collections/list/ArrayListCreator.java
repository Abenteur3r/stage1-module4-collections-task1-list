package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> res = new ArrayList<>();
        for(String i : sourceList){
            int index = sourceList.indexOf(i)+1;
            if (index %3==0){
                res.add(i);
                res.add(i);
            }
        }
        return res;
    }
}
