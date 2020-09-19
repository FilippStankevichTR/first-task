package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

public class FileDataAcquirerTest {

    private final static String FILE_NAME = "src/test/resources/input.txt";
    private static final String INVALID_FILE = "invalid.txt";

    @Test
    public void testGetNumberShouldReadFromFileWhenFileExists() throws DataException {
        //given
        FileDataAcquirer acquirer = new FileDataAcquirer(FILE_NAME);
        //when
        int actual = acquirer.getNumber();
        //then
        Assert.assertEquals(5, actual);
    }

    @Test(expected = DataException.class) //then
    public void testGetNumberShouldThrowExceptionWhenFileNotExists() throws DataException {
        //given
        FileDataAcquirer acquirer = new FileDataAcquirer(INVALID_FILE);
        //when
        acquirer.getNumber();
    }
}
