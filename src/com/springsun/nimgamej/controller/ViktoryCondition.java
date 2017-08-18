package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.model.ListOfHeaps;

public class ViktoryCondition {
    
    public static boolean nobodyHasWonYet(int[] heaps){
        int sum = 0;
        for (int i = 0; i < heaps.length; i++) {
            sum += heaps[i];
        }
        if (sum == 0) {
            return false;
        }
        return true;
    }
    
}
