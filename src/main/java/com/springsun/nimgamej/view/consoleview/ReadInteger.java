package com.springsun.nimgamej.view.consoleview;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadInteger {

    private static Logger log = Logger.getLogger(ReadInteger.class.getName());

    public static int readInt() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        int result;
        String wrong = "Please enter a non-negative integer number";
        do {
            try {
                result = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(wrong);
                result = -1;
                log.log(Level.INFO, "Failed to parse user's string to integer: ", e);
                continue;
            }
            if (result < 0) {
                System.out.println(wrong);
            }
        } while (result < 0);
        return result;
    }

}
