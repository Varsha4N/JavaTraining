package com.targetindia.programs;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class ReadWriteFileDemo {
    public static void main(String[] args) {

        String fileName1 = "users.csv";
        String fileName2="data.txt";

        File file = new File(fileName2);

        try (
                FileReader file1= new FileReader(fileName1);
                BufferedReader in = new BufferedReader(file1);
                FileWriter writer = new FileWriter(file,true);
                PrintWriter out = new PrintWriter(writer);
                ){
            String data;
            while ((data=in.readLine())!=null){
                out.printf(data);
            }

        }
        catch (Exception e){
            log.warn("Error occurred : {} ",e.getMessage() );
        }
    }
}
