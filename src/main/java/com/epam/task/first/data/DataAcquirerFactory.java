package com.epam.task.first.data;

public class DataAcquirerFactory {

    private final static String FILE_NAME = "src/main/resources/input.txt";

    public DataAcquirer createDataAcquirer(InputType inputType) {
        switch (inputType){
            case FILE:
                return new FileDataAcquirer(FILE_NAME);
            case CONSOLE:
                return new ConsoleDataAcquirer();
            default:
                throw new IllegalArgumentException("Unknown input type = " + inputType);
        }
    }

}
