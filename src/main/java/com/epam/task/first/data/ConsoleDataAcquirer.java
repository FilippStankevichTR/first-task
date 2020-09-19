package com.epam.task.first.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {

    public int getNumber() {
        System.out.println("Enter a number:");

        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
//        Scanner scanner = new Scanner(System.in);
//        try {
//            return scanner.nextInt();
//        } finally {
//            scanner.close();
//        }
    }
}
