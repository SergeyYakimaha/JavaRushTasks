import java.lang.reflect.Array;
import java.util.*;

public class MainApp {

    public static void main(String[] args) {
/*        Account<Integer, String> account_int = new Account<Integer, String>(50, "Test1");
        Account<String, String> account_string = new Account<String, String>("60", "Test2");

        System.out.println(account_int.getId() + 50);
        System.out.println(account_string.getId());

        account_int.testMethod(new Integer[] {1, 2, 3}, 2)*/;

        List<Kitty> src = new ArrayList<Kitty>();
        src.add(new Kitty("1"));
        src.add(new Kitty("2"));
        src.add(new Kitty("3"));

        List<Pet> dest = new ArrayList<Pet>();

        dest.add(new Pet("6"));
        dest.add(new Pet("7"));
        dest.add(new Pet("8"));

        Collections.copy(dest, src);

        for(Pet p: dest) {
            System.out.println(p.getClass());
            p.call();
            Animal.printMessage(null);
        }

    }

}
