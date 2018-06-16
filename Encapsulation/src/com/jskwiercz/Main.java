package com.jskwiercz;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(80, true);
        printer.fillToner(10);
        printer.fillToner(40);
        System.out.println("Toner level: " + printer.getTonerLevel());
        printer.printPage(3);
        System.out.println("Total pages printed: " + printer.getPagesPrinted());
    }
}
