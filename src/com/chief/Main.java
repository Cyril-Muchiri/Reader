package com.chief;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException {
       // FileWrite fileWrite=new FileWrite();
        FileRead fileRead=new FileRead();
        Thread thread2=new Thread(fileRead);
        //Thread thread1=new Thread(fileWrite);
       // thread1.start();
        //thread1.join();
        thread2.start();


        Thread.sleep(1000);

    }
}
