package ru.job4j.oop;

public class User {
    /**
     *  Ниже это поля объекта.
     *  Они могут объявляется в области класса.
     *  Они не могут объявляться в методе
     */
    private String name;
    private int age;

    public boolean canDrive() {
      /**
      * can - это локальная переменная которая принадлежит методу.
      * Работать с этой переменной мы можем только внутри этого метода.
      */
       boolean can = false;
       if (age >= 18) {
          can = true;
       }
       return can;
    }
}
