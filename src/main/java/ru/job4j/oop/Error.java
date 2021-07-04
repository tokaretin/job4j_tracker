package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;
    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("a) " + active);
        System.out.println("b) " + status);
        System.out.println("c) " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 500, "lvnvnxlcknv");
        error.printInfo();
        System.out.println();
        Error other = new Error(false, 2332, "ljklj");
        other.printInfo();
        System.out.println();
        Error there = new Error(true, 654654, "dga");
        there.printInfo();
    }
}
