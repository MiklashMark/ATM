package org.example;

import org.example.exception.ATMException;
import org.example.core.Core;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("fsd");
        Core core = new Core();
        try {
            core.start();
        } catch (ATMException | IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void gogit(){
        //nothing;ffsfhgjhgkfzdxgchjvbkj
    }
}