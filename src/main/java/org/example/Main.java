package org.example;

import org.example.exceptiom.ATMException;
import org.example.core.Core;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Core core = new Core();
        try {
            core.start();
        } catch (ATMException | IOException e) {
            throw new RuntimeException(e);
        }


    }
}