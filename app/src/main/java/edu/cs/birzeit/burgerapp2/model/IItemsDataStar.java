package edu.cs.birzeit.burgerapp2.model;

import java.util.List;

public interface IItemsDataStar {
    public List<String> getCategories2();
    public List<FoodItemStar> getItemsByCat2(String cat2);
}
