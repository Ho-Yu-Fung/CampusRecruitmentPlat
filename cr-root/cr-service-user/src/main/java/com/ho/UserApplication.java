package com.ho;

import com.ho.thread.ScanThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class UserApplication implements CommandLineRunner {
    @Autowired
    ScanThread scanThread;
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
        System.out.println(Thread.currentThread().getName()+"ssss");
    }

    @Override
    public void run(String... args) throws Exception {
        scanThread.init();
    }
}
