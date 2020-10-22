package Interfaces;

public class Journal implements Printable, PicturePrinting {
    @Override
    public void print() {
        System.out.println("I'm the journal");
    }

    @Override
    public void printPicture() {
        System.out.println("Printing pictures");
    }
}
