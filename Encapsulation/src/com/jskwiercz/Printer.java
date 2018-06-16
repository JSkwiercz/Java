package com.jskwiercz;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
    }

    public int fillToner(int amount) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            if (tonerLevel + amount > 100) {
                System.out.println("Failed to fill toner.");
                return -1;
            }
            else {
                return tonerLevel += amount;
            }
        } else
            return -1;
    }

    public int printPage(int pages) {
        int pagesToPrint = pages;
        System.out.println("Printing...");
        if (isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            this.pagesPrinted += pagesToPrint;
        }
        else
            this.pagesPrinted += pages;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
