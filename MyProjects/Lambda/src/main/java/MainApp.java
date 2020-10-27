import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MainApp {

    public static class User {
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        FIString fiString;

        fiString = text -> text.toUpperCase();

        System.out.println(fiString.getUpperCaseStr("ggg"));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(n -> System.out.println(n));

        Predicate<Integer> p = (x) -> x == 2;

        User user = new User("Sergey", 43);

        UnaryOperator<User> fn = u -> {
            u.setAge(50);
            return u;
        };

        fn.apply(user);

        System.out.println(user);
    }
}
