package pract3.task1.controller;

import pract3.task1.model.entities.Store;

import java.util.ArrayList;

public class Runner {

    private Store store;

    public Runner(Store store) {
        this.store = store;
    }

    public void run() {
        fillStore();
        store.showStore();
        store.sortDepartments();
        store.showStore();
    }


    private void fillStore() {
        ArrayList<String> services1 = new ArrayList<>();
        services1.add("Buy food");
        services1.add("Order food");
        store.createDepartment("Grocery", "Some description",
                "Products", services1,"street 1");
        ArrayList<String> food = new ArrayList<>();
        food.add("Bananas");
        food.add("Meat");
        food.add("Bread");
        store.addGoods(food, "Grocery");

        ArrayList<String> services2 = new ArrayList<>();
        services2.add("Buy clothes");
        services2.add("Order clothes");
        store.createDepartment("Clothing store", "Some description",
                "Clothes", services2,"street 2");
        ArrayList<String> clothes = new ArrayList<>();
        clothes.add("T-shirts");
        clothes.add("Hats");
        store.addGoods(clothes, "Clothing store");

        ArrayList<String> services3 = new ArrayList<>();
        services3.add("Buy phones");
        services3.add("Order phones");
        store.createDepartment("Phone store", "Some description",
                "Phones", services3,"street 3");
        ArrayList<String> phones = new ArrayList<>();
        phones.add("Samsung");
        phones.add("Iphone");
        phones.add("Xiaomi");
        phones.add("Meizu");
        store.addGoods(phones, "Phone store");

    }
}
