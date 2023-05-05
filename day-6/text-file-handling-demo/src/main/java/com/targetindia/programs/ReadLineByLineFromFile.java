package com.targetindia.programs;

import com.targetindia.utils.KeyboardUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileReader;

@Slf4j
public class ReadLineByLineFromFile {
    public static void main(String[] args) {
        String fileName = KeyboardUtil.getString("Enter file name : ");

        try (
                FileReader reader = new FileReader(fileName);
                BufferedReader in = new BufferedReader(reader);
                ){

            String data;
            while ((data = in.readLine())!=null){
                System.out.println(data);
            }

        }
        catch (Exception e){
            log.warn("An error occurred {}",e.getMessage());
        }

    }
}
