package org.example;

import org.example.exception.Exception;
import org.example.core.Core;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("fsd");
        Core core = new Core();
        try {
            core.start();
        } catch (Exception | IOException e) {
            throw new RuntimeException(e);
        }
    }
}