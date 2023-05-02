package com.chief;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead implements Runnable {
    String s;
    BufferedReader reader;

    @Override
    public void run() {
        {
            try {
                reader = new BufferedReader(new FileReader("C:\\Users\\Baby Beast\\Desktop\\finalisima\\trial.txt"));
                while ((s = reader.readLine())!=null) System.out.println(s);
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
