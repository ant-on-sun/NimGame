package com.springsun.nimgamej.view.consoleview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInteger {

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
                continue;
            }
            if (result < 0) {
                System.out.println(wrong);
            }
        } while (result < 0);
        return result;
    }

}
