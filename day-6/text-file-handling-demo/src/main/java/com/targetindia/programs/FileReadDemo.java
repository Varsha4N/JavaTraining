package com.targetindia.programs;

import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Slf4j
public class FileReadDemo {

    public static void main(String[] args) {

        String filename= "users.csv";
        FileReader reader =null;

        try{
            reader = new FileReader(filename);
            log.trace("File exists, continuous to read the same");
            int ch;
            while ((ch= reader.read())!=-1){
                System.out.print((char)ch);
            }

        }
        catch (FileNotFoundException e){

            log.warn("No such file : "+filename);
        }
        catch (IOException e){
            log.warn("There was an error while reading a file");

        }
        finally {
            if(reader != null){
                try{
                    reader.close();
                }catch (IOException e){
                    log.warn("There was a problem while closing the file");
                }
            }

        }



    }

}
