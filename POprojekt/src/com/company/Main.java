package com.company;

import java.util.Scanner;

public class Main {

    private static ItemDAO Base = new ItemDAO();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        while (!quit) {
            System.out.println("Choose option: \n" +
                    "1 - Show your items\n" +
                    "2 - Add item\n" +
                    "3 - Remove Item\n" +
                    "4 - Find Item\n" +
                    "5 - Quit");
            int select = scan.nextInt();
            scan.nextLine();
            switch (select) {
                case 1:
                    Base.showItems();
                    break;


                case 2:
                    addNewItem();
                    break;

                case 3:
                    removeItem();
                    break;

                case 4:
                    searchItem();
                    break;

                case 5:
                    quit = true;
                    break;
            }
        }
    }

    public static void addNewItem() {
        System.out.println("What you wanna add? \n" +
                "1 - Book\n" +
                "2 - Ebook\n" +
                "3 - Audiobook\n" +
                "4 - CD-Album");
        int select = scan.nextInt();
        scan.nextLine();
        switch (select) {
            case 1:
                System.out.print("Type id: ");
                int id1 = scan.nextInt();
                scan.nextLine();
                System.out.print("Type title: ");
                String title1 = scan.nextLine();
                System.out.print("Type author: ");
                String author1 = scan.nextLine();
                System.out.print("Type pages: ");
                int pages1 = scan.nextInt();
                scan.nextLine();
                System.out.print("Type cover: ");
                String cover = scan.nextLine();
                Book newBook = new Book(id1, title1, author1, pages1, cover);
                Base.addItem(newBook);
                break;

            case 2:
                System.out.print("Type id: ");
                int id2 = scan.nextInt();
                scan.nextLine();
                System.out.print("Type title: ");
                String title2 = scan.nextLine();
                System.out.print("Type author: ");
                String author2 = scan.nextLine();
                System.out.print("Type pages: ");
                int pages2 = scan.nextInt();
                scan.nextLine();
                System.out.print("Type format: ");
                String format = scan.nextLine();
                Ebook newEbook = new Ebook(id2, title2, author2, pages2, format);
                Base.addItem(newEbook);
                break;

            case 3:
                System.out.print("Type id: ");
                int id3 = scan.nextInt();
                scan.nextLine();
                System.out.print("Type title: ");
                String title3 = scan.nextLine();
                System.out.print("Type author: ");
                String author3 = scan.nextLine();
                System.out.print("Type duration: ");
                double duration = scan.nextDouble();
                scan.nextLine();
                Audiobook newAudiobook = new Audiobook(id3, title3, author3, duration);
                Base.addItem(newAudiobook);
                break;

            case 4:
                System.out.print("Type id: ");
                int id4 = scan.nextInt();
                scan.nextLine();
                System.out.print("Type title: ");
                String title4 = scan.nextLine();
                System.out.print("Type author: ");
                String author4 = scan.nextLine();
                Album newAlbum = new Album(id4, title4, author4);
                Base.addItem(newAlbum);
                break;

        }
    }
    public static void removeItem() {
        System.out.println("Type item's id: ");
        int id = scan.nextInt();
        scan.nextLine();
        Item item = Base.getItem(id);
        if (item != null) {
            Base.removeItem(item);
        }
        else {
            System.out.println("There is no item with this id");
        }
    }

    public static void searchItem() {
        System.out.println("Type search cryteria: \n" +
                "1 - By id\n" +
                "2 - By type\n" +
                "3 - By title\n" +
                "4 - By author\n");
        int select = scan.nextInt();
        scan.nextLine();
        switch (select) {
            case 1:
                for(int i = 0; i < )
                Base.getItem(id);
                break;

            case 2:
                Base.getItemType();
                break;

            case 3:
                Base.getItemTitle(title);
                break;

            case 4:
                Base.getItemAuthor(author);
                break;
        }
    }
}
