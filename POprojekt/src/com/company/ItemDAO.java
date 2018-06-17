package com.company;

import java.util.ArrayList;

public class ItemDAO {
    private ArrayList<Item> items;

    public ItemDAO() {
        this.items = new ArrayList<Item>();
        Item HawTeorEbook = new Ebook(26, "Teoria wszystkiego, czyli krótka historia wszechświata", "Stephen Hawking", 144, "MOBI");
        Item HawTeorBook = new Book(92, "Teoria wszystkiego, czyli krótka historia wszechświata", "Stephen Hawking", 120, "Hard");
        Item HawTeorAudio = new Audiobook(67, "Teoria wszystkiego, czyli krótka historia wszechświata", "Stephen Hawking", 1.40);
        Item ACDCBlack = new Album(43, "Back in Black", "ACDC");
        this.items.add(HawTeorEbook);
        this.items.add(HawTeorBook);
        this.items.add(HawTeorAudio);
        this.items.add(ACDCBlack);

    }

    public boolean addItem(Item item) {
        if (findItem(item.getId()) == null) {
            this.items.add(item);
            System.out.println("Item added");
            return true;
        } else {
            System.out.println("Item with this id already exists");
            return false;
        }
    }

    private Item findItem(int id) {
        for (Item checkedItem : this.items) {
            if (checkedItem.getId() == id)
                return checkedItem;
        }
        return null;
    }

    public void showItems() {
        if (items.size() == 0) {
            System.out.println("There are no items in your base");
        } else {
            for (Item item : this.items) {
                item.getInfo();
            }
        }
    }

    public void removeItem(Item item) {
        if (findItem(item.getId()) != null) {
            items.remove(item);
            System.out.println("Item removed");
        }
    }

    public Item getItem(int id) {
        if (findItem(id) != null)
            return findItem(id);
        return null;
    }

    public void showItemId(int id) {
        if (items.size() == 0) {
            System.out.println("There are no items in your base");
        }
        else {
            for (Item item : this.items) {
                if(item.getId() == id)
                    item.getInfo();
            }
        }
    }

    public void showItemTitle(String title) {
        if (items.size() == 0) {
            System.out.println("There are no items in your base");
        } else {
            for (Item item : this.items) {
                if (item.getTitle().equals(title))
                    item.getInfo();
            }
        }
    }

    public void showItemAuthor(String author) {
        if (items.size() == 0) {
            System.out.println("There are no items in your base");
        } else {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getAuthor().equals(author))
                    items.get(i).getInfo();
            }
        }
    }

    public void showItemType() {


    }
}
