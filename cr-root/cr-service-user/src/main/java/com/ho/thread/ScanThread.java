package com.ho.thread;

import org.springframework.stereotype.Component;

@Component
public class ScanThread implements Runnable {
    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"Thread....run");
        }
    }
    public void init(){
        new Thread(new ScanThread()).start();
    }
}
