package Interfaces;

public class Magazine implements Printable {
    @Override
    public void print() {
        System.out.println("I'm the magazine");
    }
}
