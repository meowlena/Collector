package com.meowlena.collector.collections;

import com.meowlena.collector.itens.Item;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Collection {
    private String name;
    private String type;
    private LocalDate start;
    private final List<Item> items = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public List<Item> getItems() {
        return items;
    }

    public void listItems() {

    }

    public void addItem(Object object) {

    }

    public void showItem(String name) {

    }

    public void searchItem(String name) {

    }

    public void removeItem(String name) {

    }
}

