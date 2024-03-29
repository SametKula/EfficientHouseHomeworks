package com.sametkula.java.PT_arrays.leetcode.theKWeakestRowsinaMatrix;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Solution {
    int[][] mat;
    public int[] kWeakestRows(int[][] mat, int k) {
        this.mat = mat;
        var map = new TreeMap<Integer, PriorityQueue<Integer>>();

        for (int i = 0; i < mat.length; i++){
            int soilders = getSoildersCount(i);
            map.putIfAbsent(soilders, new PriorityQueue<>());
            map.get(soilders).add(i);
        }
        int[] result = new int[k];
        int i = 0;
        for (int key : map.keySet()){
            PriorityQueue<Integer> curr = map.get(key);
            while(!curr.isEmpty()){
                result[i] = curr.poll();
                i++;
                if (i == k)
                    break;
            }
        }

        return result;

    }
    private int getSoildersCount(int index){
        int res = 0;
        for (int i : mat[index]){
            if( i == 0)
                break;
            res++;
        }
        return res;
    }

}
