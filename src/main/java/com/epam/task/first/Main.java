package com.epam.task.first;

import java.nio.file.Files;

import com.epam.task.first.data.ConsoleDataAcquirer;
import com.epam.task.first.data.DataAcquirer;
import com.epam.task.first.logic.DigitCalculator;
import com.epam.task.first.view.ConsoleResultPrinter;
import com.epam.task.first.view.ResultPrinter;

public class Main {
    //SOLID
    // Lose coupling, High cohesion
    public static void main(String[] args) {

        //получить число
        DataAcquirer acquirer = new ConsoleDataAcquirer(); //= new DataAcquirer?
        int number = acquirer.getNumber();

        // посчитать
        DigitCalculator calculator = new DigitCalculator();
        int lastSquareDigit = calculator.findSquareLastDigit(number);

        // вывести
        ResultPrinter printer = new ConsoleResultPrinter();
        printer.print(lastSquareDigit);
    }

}
