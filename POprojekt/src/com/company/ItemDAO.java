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
        addItem(HawTeorEbook);
        addItem(HawTeorBook);
        addItem(HawTeorAudio);
        addItem(ACDCBlack);

    }

    public boolean addItem(Item item) {
        if (findItem(item.getId()) != null) {
            this.items.add(item);
            System.out.println("Item added");
            return true;
        }
        return false;
    }

    private Item findItem(int id) {
        for (Item checkedItem : this.items) {
            if (checkedItem.getId() == id)
                return checkedItem;
        }
        return null;
    }

    public void get() {

    }
}
