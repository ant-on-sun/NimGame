package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.model.ListOfHeaps;

public class ViktoryCondition {
    
    public static boolean nobodyHasWonYet(int[] heaps){
        int sum = 0;
        for (int heap : heaps) {
            sum += heap;
        }
        if (sum == 0) {
            return false;
        }
        return true;
    }
    
}
