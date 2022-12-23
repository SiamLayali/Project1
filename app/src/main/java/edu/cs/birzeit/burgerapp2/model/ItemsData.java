package edu.cs.birzeit.burgerapp2.model;

import java.util.ArrayList;
import java.util.List;

public class ItemsData implements IItemsData{
    private List<FoodItem> items;

    public ItemsData(){
        items = new ArrayList<>();
        items.add(new FoodItem("Classic Burger", "Burgers", 20));
        items.add(new FoodItem("Zinger Burger ", "Burgers", 20));
        items.add(new FoodItem("Double tower Burger", "Burgers", 40));
        items.add(new FoodItem("Classic tower Burger", "Burgers", 30));
        items.add(new FoodItem("Mini Burger", "Burgers", 10));

        items.add(new FoodItem(" Double bucket", "Bucket Meals", 100));
        items.add(new FoodItem("Colonel's bucket", "Bucket Meals", 100));
        items.add(new FoodItem("Star bucket", "Bucket Meals", 60));
        items.add(new FoodItem("Solo bucket ", "Bucket Meals", 45));
        items.add(new FoodItem("15 strips family bucket", "Bucket Meals", 135));

        items.add(new FoodItem(" Spicy wings ", "Chickens", 32));
        items.add(new FoodItem(" Strips ", "Chickens", 55));
        items.add(new FoodItem(" Chicken on the bone pieces ", "Chickens", 47));

        items.add(new FoodItem("Diet coca Cola", "Drinks", 5));
        items.add(new FoodItem("Coca Cola", "Drinks", 5));
        items.add(new FoodItem("Sprite", "Drinks", 5));
        items.add(new FoodItem(" XL", "Drinks", 5));


    }
    @Override
    public List<String> getCategories() {
       List<String> cats = new ArrayList<>();
       cats.add("Burgers");
       cats.add("Chickens");
       cats.add("Drinks");
       cats.add("Bucket Meals");
       return cats;
    }

    @Override
    public List<FoodItem> getItemsByCat(String cat) {
        List<FoodItem> result = new ArrayList<>();

        for(FoodItem it : items){
            if(it.getCat().equals(cat)){
                result.add(it);
            }
        }
        return result;
    }
}
