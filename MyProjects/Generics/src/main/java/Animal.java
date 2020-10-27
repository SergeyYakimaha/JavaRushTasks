import com.sun.istack.internal.NotNull;

public class Animal {
    static void printMessage(@NotNull String str) {
        System.out.println(str);
    }

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void feed() {
        System.out.println("Я кушаю");
    }
}
