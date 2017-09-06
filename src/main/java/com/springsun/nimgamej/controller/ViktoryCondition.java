package com.springsun.nimgamej.controller;

import java.util.logging.Logger;

class ViktoryCondition {
    private static Logger log = Logger.getLogger(ViktoryCondition.class.getName());
    
    static boolean nobodyHasWonYet(int[] heaps){
        int sum = 0;
        for (int i = 0; i < heaps.length; i++) {
            sum += heaps[i];
        }
        if (sum == 0) {
            log.fine("Somebody has won, there are no stones in the HEAPS");
            return false;

        }
        log.fine("Nobody has won yet, there are some stones in the HEAPS");
        return true;
    }
    
}
