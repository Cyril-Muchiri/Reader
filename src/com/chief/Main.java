package com.chief;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Baby Beast\\Desktop\\finalisima\\trial2.txt"));
            String s;
            while ((s=reader.readLine()) !=null ) System.out.println(s);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
