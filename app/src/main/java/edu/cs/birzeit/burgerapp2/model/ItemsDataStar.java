package edu.cs.birzeit.burgerapp2.model;

import java.util.ArrayList;
import java.util.List;

public class ItemsDataStar implements IItemsDataStar {
    private List<FoodItemStar> itemStars;

     public ItemsDataStar(){
         itemStars = new ArrayList<>();
         itemStars.add(new FoodItemStar("Peppermint Hot Chocolate", "Hot Drinks", 25));
         itemStars.add(new FoodItemStar("Toasted White Hot Chocolate", "Hot Drinks", 25));
         itemStars.add(new FoodItemStar("Pumpkin Spice Crème", "Hot Drinks", 25));
         itemStars.add(new FoodItemStar("Caramel Brulée Crème", "Hot Drinks", 25));
         itemStars.add(new FoodItemStar("Vanilla Crème", "Hot Drinks", 25));


         itemStars.add(new FoodItemStar("Dragon Drink", "Cold Drinks", 25));
         itemStars.add(new FoodItemStar("Paradise Drink", "Cold Drinks", 25));
         itemStars.add(new FoodItemStar("Strawberry Açaí", "Cold Drinks", 25));
         itemStars.add(new FoodItemStar("Pineapple Passionfruit", "Cold Drinks", 25));


         itemStars.add(new FoodItemStar("Pumpkin Cream Cold Brew", "Cold Coffee", 25));
         itemStars.add(new FoodItemStar("Irish Cream Cold Brew", "Cold Coffee", 25));
         itemStars.add(new FoodItemStar("Vanilla Sweet Cream", "Cold Coffee", 25));




     }

    @Override
    public List<String> getCategories2() {
        List<String> cats2 = new ArrayList<>();
        cats2.add("Hot Drinks");
        cats2.add("Cold Drinks");
        cats2.add("Cold Coffee");

        return cats2;
    }

    @Override
    public List<FoodItemStar> getItemsByCat2(String cat2) {
        List<FoodItemStar> results = new ArrayList<>();

        for(FoodItemStar it : itemStars){
            if(it.getCat2().equals(cat2)){
                results.add(it);
            }
        }
        return results;
    }


}
