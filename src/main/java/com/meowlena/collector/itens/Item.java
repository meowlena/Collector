package com.meowlena.collector.itens;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Item {
    private short id;
    private String name;
    private int year;
    private LocalDate acquisition;
    private String storagePlace;
    private String autograph;
    private final List<String> tags = new ArrayList<>();

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getAcquisition() {
        return acquisition;
    }

    public void setAcquisition(LocalDate acquisition) {
        this.acquisition = acquisition;
    }

    public String getStoragePlace() {
        return storagePlace;
    }

    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public List<String> getTags() {
        return tags;
    }

    public void showItem() {

    }

    public void updateItem() {

    }
}