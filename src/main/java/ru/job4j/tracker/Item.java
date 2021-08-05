package ru.job4j.tracker;

public class Item {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}


/** для вызывания методов

    public void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println();
    }

    public static void main(String[] args) {
        Item first = new Item("Андрей");
        first.printInfo();
        Item second = new Item(525, "Сергей");
        second.printInfo();
    }

 */
