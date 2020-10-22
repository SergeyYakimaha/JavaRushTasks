package Interfaces;

public class MainApp {
    public static void main(String[] args) {
        Printable printable = new Magazine();
        printable.print();

       Printable book1 = new Book();
       book1.print();
       ((Book)book1).printAuthor();

       PicturePrinting journal_1 = new Journal();
       Printable journal_2 = new Journal();

    }
}
