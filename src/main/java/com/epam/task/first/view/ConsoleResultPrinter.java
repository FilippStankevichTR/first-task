package com.epam.task.first.view;

public class ConsoleResultPrinter implements ResultPrinter {

    public void print(final int number) {
        System.out.println("Last square digest = " + number);
    }
}
