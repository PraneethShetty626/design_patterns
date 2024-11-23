package com.patterns.adapter;

public class GroceryItemAdapter implements Item{
    private GroceryItem item;

    GroceryItemAdapter(GroceryItem item){
        this.item = item;
    }

    @Override
    public String getItemName() {
        return item.getName();
    }

    @Override
    public String getPrice() {
        return item.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return item.getStoreName();
    }
}
