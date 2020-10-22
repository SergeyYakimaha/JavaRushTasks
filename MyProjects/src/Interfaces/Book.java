package Interfaces;

public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("I'm the book");
    }

    public void printAuthor() {
        System.out.println("Print Author");
    }
}
