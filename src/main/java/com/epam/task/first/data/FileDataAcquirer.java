package com.epam.task.first.data;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer {

    private String filename;

    public FileDataAcquirer(String filename){
        this.filename = filename;
    }

    @Override
    public int getNumber() throws DataException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            return Integer.parseInt(line);
        } catch (IOException | NumberFormatException e) {
            throw new DataException(e.getMessage(), e);
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
