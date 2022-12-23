package edu.cs.birzeit.burgerapp2.model;

import androidx.annotation.NonNull;

public class FoodItemStar {
    private String name2;
    private String cat2;
    private double price2;

    public FoodItemStar(String name2, String cat2, double price2) {
        this.name2 = name2;
        this.cat2 = cat2;
        this.price2 = price2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getCat2() {
        return cat2;
    }

    public void setCat2(String cat2) {
        this.cat2 = cat2;
    }

    public double getPrice2() {
        return price2;
    }

    public void setPrice2(double price2) {
        this.price2 = price2;
    }

    @NonNull
    @Override
    public String toString() {
        return getName2() + "  ₪" + getPrice2();
    }
}



