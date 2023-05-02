package com.chief;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite extends Thread {
    BufferedWriter writer;

    {
        try {
            writer = new BufferedWriter(new FileWriter("C:\\Users\\Baby Beast\\Desktop\\finalisima\\trial2.txt"));
            writer.write("\n How are you today");
            writer.close();
            Thread.sleep(2000);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
