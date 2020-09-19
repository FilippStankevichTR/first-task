package com.epam.task.first;

import com.epam.task.first.data.DataAcquirer;
import com.epam.task.first.data.DataAcquirerFactory;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.InputType;
import com.epam.task.first.logic.DigitCalculator;
import com.epam.task.first.view.ConsoleResultPrinter;
import com.epam.task.first.view.ResultPrinter;

public class Main {
    //SOLID
    // Lose coupling, High cohesion
    public static void main(String[] args) throws DataException {

        String type = args[0];
        InputType inputType = InputType.valueOf(type);

        //получить число
        DataAcquirerFactory factory = new DataAcquirerFactory();
        DataAcquirer acquirer = factory.createDataAcquirer(inputType);
        int number = acquirer.getNumber();
        System.out.println(number);

        // посчитать
        DigitCalculator calculator = new DigitCalculator();
        int lastSquareDigit = calculator.findSquareLastDigit(number);

        // вывести
        ResultPrinter printer = new ConsoleResultPrinter();
        printer.print(lastSquareDigit);
    }

}
