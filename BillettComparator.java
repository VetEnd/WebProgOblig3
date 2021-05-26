package com.example.demo;

import java.util.Comparator;

public class BillettComparator implements Comparator {

    public int compare(Object k1, Object k2){
        biletter o1 = (biletter) k1;
        biletter o2 = (biletter) k2;

        return o1.getEnavn().compareTo(o2.getEnavn());
    }

}
