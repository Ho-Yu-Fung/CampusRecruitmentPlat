package com.ho;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.HashSet;

public class test {
    public static void main(String[] args) throws Exception{
        String[] area = {"FZ","LY","ND","NP","PT","QZ","SM","XM","ZZ"} ;

        FileWriter fileWriter = new FileWriter("W:\\GRANT.txt",false);
        String line;
        for(int i = 0; i < area.length;i++){
            FileReader SP = new FileReader("W:\\SP.txt");
            FileReader SQ = new FileReader("W:\\SQ.txt");
            fileWriter.write("GRANT SELECT ON VM_FAULT_ORDER_SP_"+area[i]+"  TO WFM2"+area[i]+";\n");
        }
        fileWriter.close();
    }
}
