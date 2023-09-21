package com.sametkula.java.PT_strings.leetcode.reconstructItinerary;

import org.junit.Test;

import java.util.*;

public class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        var map = new HashMap<String, PriorityQueue<String>>();
        for (List<String> l : tickets) {
            map.putIfAbsent(l.get(0), new PriorityQueue<>());
            map.get(l.get(0)).add(l.get(1));
        }
        var result = new ArrayList<String>();
        String next = "JFK";
        while (map.get(next) != null && !next.isEmpty()){
            result.add(next);
            next = map.get(next).poll();
        }
        if (next!= null)
            result.add(next);
        return result;
    }
    @Test
    public void test(){
        var test = new ArrayList<List<String>>() ;
        var l1 = new ArrayList<String>();
        l1.add("MUC");
        l1.add("LHR");
        var l2 = new ArrayList<String>();
        l2.add("JFK");
        l2.add("MUC");
        var l3 = new ArrayList<String>();
        l3.add("SFO");
        l3.add("SJC");
        var l4 = new ArrayList<String>();
        l4.add("LHR");
        l4.add("SFO");
        test.add(l1);
        test.add(l2);
        test.add(l3);
        test.add(l4);


        System.out.println(findItinerary(test));
    }
}
